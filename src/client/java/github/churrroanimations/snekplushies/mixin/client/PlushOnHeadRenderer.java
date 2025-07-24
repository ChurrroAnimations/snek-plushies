package github.churrroanimations.snekplushies.mixin.client;

import github.churrroanimations.snekplushies.init.ItemsReg;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RotationAxis;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ArmorFeatureRenderer.class)
public class PlushOnHeadRenderer {
    @Inject(method = "renderArmor", at = @At("HEAD"))
    public void plushOnHeadRenderer (MatrixStack matrices, VertexConsumerProvider vertexConsumers, LivingEntity entity, EquipmentSlot armorSlot, int light, BipedEntityModel model, CallbackInfo ci) {
        if (armorSlot == EquipmentSlot.HEAD) {
            ItemStack headStack = entity.getEquippedStack(armorSlot);
            Item headItem = headStack.getItem();
            boolean useRenderer = false;
            double transX = -0.05D;
            double transY = -0.25D;
            double transZ = -0.1D;
            float scaleX = 1F;
            float scaleY = 1F;
            float scaleZ = 1F;
            float turnX = -90F;
            float turnY = 0F;
            float turnZ = 90F;

            if (headItem == ItemsReg.leviSnekkyPlushie) {
                useRenderer = true;
            } else if (headItem == ItemsReg.churroTurtlePlushie) {
                useRenderer = true;
                transX = 0D;
                transY = -0.55D;
                scaleX = 0.5F;
                scaleY = 0.5F;
                scaleZ = 0.5F;
                turnX = -80F;
            } else if (headItem == ItemsReg.cherrySnekkyPlushie) {
                useRenderer = true;
                transY = -0.3D;
                transZ = 0;
            } else if (headItem == ItemsReg.grimPupperPlushie) {
                useRenderer = true;
            }


            if (useRenderer) {
                MinecraftClient currentClient = MinecraftClient.getInstance();

                matrices.push();

                model.head.rotate(matrices);
                matrices.translate(transX, transY, transZ);
                matrices.scale(scaleX, scaleY, scaleZ);
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(turnX));
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(turnY));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(turnZ));

                currentClient.getItemRenderer().renderItem(
                        headStack,
                        ModelTransformationMode.FIXED,
                        light,
                        OverlayTexture.DEFAULT_UV,
                        matrices,
                        vertexConsumers,
                        entity.getWorld(),
                        0
                );

                matrices.pop();
            }
        }
    }
}
