// Date: 7/21/2016 6:26:35 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.jtrent238.epicproportions.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCandyPopper extends ModelBase
{
  //fields
    ModelRenderer Stick;
    ModelRenderer Head;
  
  public ModelCandyPopper()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Stick = new ModelRenderer(this, 0, 0);
      Stick.addBox(0F, 0F, 0F, 2, 24, 2);
      Stick.setRotationPoint(-1F, 0F, -1F);
      Stick.setTextureSize(64, 32);
      Stick.mirror = true;
      setRotation(Stick, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(0F, 0F, 0F, 16, 18, 4);
      Head.setRotationPoint(-8F, -11F, -2F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Stick.render(f5);
    Head.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
