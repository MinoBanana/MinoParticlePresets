package net.particleeffects.procedures;

import net.particleeffects.network.ParticlepresetsModVariables;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class ShakeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			ParticlepresetsModVariables.PlayerVariables _vars = entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES);
			_vars.quake = entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES).quake + 1;
			_vars.syncPlayerVariables(entity);
		}
		if (entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES).quake == 0) {
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() + 1));
				_ent.setXRot((float) (entity.getXRot() + 1));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		} else if (entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES).quake == 1) {
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() + -2));
				_ent.setXRot((float) (entity.getXRot() + -2));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		} else if (entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES).quake == 2) {
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() + 1));
				_ent.setXRot((float) (entity.getXRot() + 1));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		} else if (entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES).quake == 3) {
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() + 1));
				_ent.setXRot((float) (entity.getXRot() + -1));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		} else if (entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES).quake == 4) {
			{
				Entity _ent = entity;
				_ent.setYRot((float) (entity.getYRot() + 0));
				_ent.setXRot((float) (entity.getXRot() + 1));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		}
		if (entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES).quake > 4) {
			{
				ParticlepresetsModVariables.PlayerVariables _vars = entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES);
				_vars.quake = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
