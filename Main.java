package platon.mods.mybestmod;
import cpw.mods.fml.common.Mod;
@Instance("MemeMob")
public static MemeMob instance;
@Mod (modid = "13.666.256", name="Meme Mob", version = "1.0");
@EventHandler;

class CommonProxy {

} 
class ClientProxy extends CommonProxy{

} 
public void preLoad(FMLPreInitializationEvent event)
{
registerEntity(WiPe.class, "Wide Putin", 0xFF8C00, 0x00FFFF);
@SidedProxy(clientSide = "MemeMob.ClientProxy", serverSide = "ваш.пакет.CommonProxy")
public static CommonProxy proxy;
}


public static void registerEntity(Class entityClass, String name, int primaryColor, int secondaryColor)
{
  int entityID = EntityRegistry.findGlobalUniqueEntityId();
  long seed = name.hashCode();

  EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
  EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true); //эта строка не нужна(зачем она?)
  EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
}
public class WiPe extends EntityAnimal
{
  public EntityTest(World par1World)
  {
  super(par1World);
  }
}

