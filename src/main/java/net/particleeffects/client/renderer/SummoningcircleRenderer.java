
package net.particleeffects.client.renderer;

import net.particleeffects.entity.SummoningcircleEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class SummoningcircleRenderer extends MobRenderer<SummoningcircleEntity, ChickenModel<SummoningcircleEntity>> {
	public SummoningcircleRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(SummoningcircleEntity entity) {
		return new ResourceLocation("particlepresets:textures/entities/empty.png");
	}
}
