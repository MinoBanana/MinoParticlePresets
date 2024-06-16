
package net.particleeffects.entity;

import net.particleeffects.procedures.SummoningcircleOnInitialEntitySpawnProcedure;
import net.particleeffects.procedures.SmallcirclespinProcedure;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.Mth;
import net.minecraft.nbt.CompoundTag;

import javax.annotation.Nullable;

public class RitualcirclesmallEntity extends PathfinderMob {
	public RitualcirclesmallEntity(EntityType<RitualcirclesmallEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (RitualcirclesmallEntity.this.isInWater())
					RitualcirclesmallEntity.this.setDeltaMovement(RitualcirclesmallEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !RitualcirclesmallEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - RitualcirclesmallEntity.this.getX();
					double dy = this.wantedY - RitualcirclesmallEntity.this.getY();
					double dz = this.wantedZ - RitualcirclesmallEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * RitualcirclesmallEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					RitualcirclesmallEntity.this.setYRot(this.rotlerp(RitualcirclesmallEntity.this.getYRot(), f, 10));
					RitualcirclesmallEntity.this.yBodyRot = RitualcirclesmallEntity.this.getYRot();
					RitualcirclesmallEntity.this.yHeadRot = RitualcirclesmallEntity.this.getYRot();
					if (RitualcirclesmallEntity.this.isInWater()) {
						RitualcirclesmallEntity.this.setSpeed((float) RitualcirclesmallEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						RitualcirclesmallEntity.this.setXRot(this.rotlerp(RitualcirclesmallEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(RitualcirclesmallEntity.this.getXRot() * (float) (Math.PI / 180.0));
						RitualcirclesmallEntity.this.setZza(f3 * f1);
						RitualcirclesmallEntity.this.setYya((float) (f1 * dy));
					} else {
						RitualcirclesmallEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					RitualcirclesmallEntity.this.setSpeed(0);
					RitualcirclesmallEntity.this.setYya(0);
					RitualcirclesmallEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.IN_FIRE))
			return false;
		if (damagesource.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (damagesource.getDirectEntity() instanceof Player)
			return false;
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.LIGHTNING_BOLT))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		if (damagesource.is(DamageTypes.TRIDENT))
			return false;
		if (damagesource.is(DamageTypes.FALLING_ANVIL))
			return false;
		if (damagesource.is(DamageTypes.DRAGON_BREATH))
			return false;
		if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion(Explosion explosion) {
		return true;
	}

	@Override
	public boolean fireImmune() {
		return true;
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		SummoningcircleOnInitialEntitySpawnProcedure.execute();
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		SmallcirclespinProcedure.execute(this);
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(NeoForgeMod.SWIM_SPEED.value(), 0.3);
		return builder;
	}
}
