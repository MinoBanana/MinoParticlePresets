package net.particleeffects.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelnuke_top<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("particlepresets", "modelnuke_top"), "main");
	public final ModelPart bone;

	public Modelnuke_top(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition middle = bone.addOrReplaceChild("middle",
				CubeListBuilder.create().texOffs(212, 176).addBox(-12.0F, -33.0F, -12.0F, 24.0F, 30.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(192, 27).addBox(-8.0F, 19.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -35.0F, 0.0F));
		PartDefinition cube_r1 = middle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(192, 230).addBox(-10.0F, -62.0F, 0.0F, 20.0F, 62.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 35.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r2 = middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(212, 230).addBox(-10.0F, -62.0F, 0.0F, 20.0F, 62.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 35.0F, 0.0F, 0.0F, 2.3126F, 0.0F));
		PartDefinition top = bone.addOrReplaceChild("top",
				CubeListBuilder.create().texOffs(206, 28).addBox(-25.0F, -16.0F, -25.0F, 50.0F, 19.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(212, 124).addBox(-20.0F, -28.0F, -20.0F, 40.0F, 12.0F, 40.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -69.0F, 0.0F));
		PartDefinition cube_r3 = top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 93).addBox(0.0F, -119.0F, -49.0F, 0.0F, 87.0F, 100.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 69.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r4 = top.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 93).addBox(0.0F, -119.0F, -50.0F, 0.0F, 87.0F, 100.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 69.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
