package com.jtrent238.epicproportions.entity;

import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.common.Loader;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.DungeonHooks;

public class EntityCandyMan extends EntityGolem implements IBossDisplayData
{
	World world = null;
	private int attackTimer;
	public static boolean Halloweenloaded;
    public EntityCandyMan(World var1)
    {
        super(var1);
        world = var1;
        experienceValue = 5;
        this.isImmuneToFire = true;
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
        this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6D, true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, IMob.mobSelector));
        this.hasCustomNameTag();
        this.setCustomNameTag("�2The Candy Man");
        addRandomArmor();
        DungeonHooks.addDungeonMob("�2The Candy Man", 180);
    }
    
   
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    }

    public boolean attackEntityAsMob(Entity p_70652_1_)
    {
        this.attackTimer = 10;
        this.worldObj.setEntityState(this, (byte)4);
        boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

        if (flag)
        {
            p_70652_1_.motionY += 0.4000000059604645D;
        }

        this.playSound("", 1.0F, 1.0F);
        return flag;
    }
protected void addRandomArmor(){

}
/*
protected void dropRareDrop(int par1){
this.dropItem(ItemLoader.itemCaptainCookieCookie, 1);
}
*/

/**
 * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
 * par2 - Level of Looting used to kill this mob.
 */
protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
{
	
	Halloweenloaded = Loader.isModLoaded("epicproportionsmod_halloween");
	
	if (Halloweenloaded){

		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_0), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_1), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_2), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_3), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_4), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_5), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_6), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_7), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_8), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_9), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_10), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_11), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_12), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_13), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_14), 2F);
		this.entityDropItem(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemCandy_15), 2F);

	}
}

	public boolean isAIEnabled()
	{
		   return true;
	}
	   
	/**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return false;
    }
    
    /**
     * Drop items of this living's type
     */
   /*
    protected void dropFewItems(boolean var1, int var2)
    {
    	this.entityDropItem(new ItemStack(item, 16), 4F);
    }
*/
    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "epicproportionsmod:candyman_hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "epicproportionsmod:candyman_death";
    }

    public void onStruckByLightning(EntityLightningBolt entityLightningBolt){
		int i = (int)this.posX;
		int j = (int)this.posY;
		int k = (int)this.posZ;
		Entity entity = this;
		
	}

	protected void fall(float l){
		int i = (int)this.posX;
		int j = (int)this.posY;
		int k = (int)this.posZ;
		super.fall(l);
		Entity entity = this;
		
	}

	public void onCriticalHit(Entity entity2) {
		int i = (int)this.posX;
		int j = (int)this.posY;
		int k = (int)this.posZ;
		Entity entity = this;
		
	}

	public void onKillEntity(EntityLiving entityLiving){
		int i = (int)this.posX;
		int j = (int)this.posY;
		int k = (int)this.posZ;
		Entity entity = this;
		
	}

	public boolean interact(EntityPlayer entity2){
		int i = (int)this.posX;
		int j = (int)this.posY;
		int k = (int)this.posZ;
		Entity entity = this;
		
		return true;
	}

	public String getEntityName(){
		return "�2The Candy Man";
	}


/**
* Will return how many at most can spawn in a chunk at once.
*/
public int getMaxSpawnedInChunk()
{
   return 4;
}


}
