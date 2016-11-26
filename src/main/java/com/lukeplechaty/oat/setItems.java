package com.lukeplechaty.oat;
import com.lukeplechaty.oat.items.ItemChisel;
import com.lukeplechaty.oat.items.ItemMachete;
import com.lukeplechaty.oat.items.ItemSickle;
import com.lukeplechaty.oat.items.ItemMortarAndPestle;
import com.lukeplechaty.oat.items.Items;
import com.lukeplechaty.oat.items.ItemWork;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class setItems
{
	private static int Max_Damage_Wood;
	private static int Max_Damage_Stone;
	private static int Max_Damage_Iron;
	private static int Max_Damage_Gold;
	private static int Max_Damage_Diamond;
	private static int Max_Damage_Tin;
	private static int Max_Damage_Copper;
	private static int Max_Damage_Silver;
	private static int Max_Damage_Lead;
	private static int Max_Damage_Nickel;
	private static int Max_Damage_Platinum;
	private static int Max_Damage_Aluminum;
	private static int Max_Damage_Mithril;
	public static boolean genores;
	public static Item item_seed;
	public static Item item_sodium;
	public static Item item_sulfur;
	public static Item item_handel;
	public static Item item_rock;
	public static Item item_dynamite;
	public static Item item_grenade;
	public static Item gem_certus_quartz;
	public static Item gem_sapphire;
	public static Item gem_ruby;
	public static Item gem_peridot;
	public static Item ingot_tin;
	public static Item ingot_copper;
	public static Item ingot_silver;
	public static Item ingot_lead;
	public static Item ingot_nickel;
	public static Item ingot_platinum;
	public static Item ingot_aluminum;
	public static Item ingot_mithril;
	public static Item ingot_cobalt;
	public static Item ingot_ardite;
	public static Item ingot_yellorium;
	public static Item dust_iron;
	public static Item dust_gold;
	public static Item dust_tin;
	public static Item dust_copper;
	public static Item dust_silver;
	public static Item dust_lead;
	public static Item dust_nickel;
	public static Item dust_platinum;
	public static Item dust_aluminum;
	public static Item dust_mithril;
	public static Item dust_cobalt;
	public static Item dust_ardite;
	public static Item dust_yellorium;
	public static Item dust_flour;
	public static Item dust_sodium;
	public static Item dust_sulfur;
	public static Item dust_charcoal;
	public static Item chunk_iron;
	public static Item chunk_gold;
	public static Item chunk_tin;
	public static Item chunk_copper;
	public static Item chunk_silver;
	public static Item chunk_lead;
	public static Item chunk_nickel;
	public static Item chunk_platinum;
	public static Item chunk_aluminum;
	public static Item chunk_mithril;
	public static Item chunk_cobalt;
	public static Item chunk_ardite;
	public static Item chunk_yellorium;
	public static Item lump_iron;
	public static Item lump_gold;
	public static Item lump_tin;
	public static Item lump_copper;
	public static Item lump_silver;
	public static Item lump_lead;
	public static Item lump_nickel;
	public static Item lump_platinum;
	public static Item lump_aluminum;
	public static Item lump_mithril;
	public static Item lump_cobalt;
	public static Item lump_ardite;
	public static Item lump_yellorium;
	public static Item lump_clean_iron;
	public static Item lump_clean_gold;
	public static Item lump_clean_tin;
	public static Item lump_clean_copper;
	public static Item lump_clean_silver;
	public static Item lump_clean_lead;
	public static Item lump_clean_nickel;
	public static Item lump_clean_platinum;
	public static Item lump_clean_aluminum;
	public static Item lump_clean_mithril;
	public static Item lump_clean_cobalt;
	public static Item lump_clean_ardite;
	public static Item lump_clean_yellorium;
	public static Item chisel_wood;
	public static Item chisel_stone;
	public static Item chisel_iron;
	public static Item chisel_gold;
	public static Item chisel_diamond;
	public static Item chisel_tin;
	public static Item chisel_copper;
	public static Item chisel_silver;
	public static Item chisel_lead;
	public static Item chisel_nickel;
	public static Item chisel_platinum;
	public static Item chisel_aluminum;
	public static Item chisel_mithril;
	public static Item sickle_wood;
	public static Item sickle_stone;
	public static Item sickle_iron;
	public static Item sickle_gold;
	public static Item sickle_diamond;
	public static Item sickle_tin;
	public static Item sickle_copper;
	public static Item sickle_silver;
	public static Item sickle_lead;
	public static Item sickle_nickel;
	public static Item sickle_platinum;
	public static Item sickle_aluminum;
	public static Item sickle_mithril;
	public static Item machete_wood;
	public static Item machete_stone;
	public static Item machete_iron;
	public static Item machete_gold;
	public static Item machete_diamond;
	public static Item machete_tin;
	public static Item machete_copper;
	public static Item machete_silver;
	public static Item machete_lead;
	public static Item machete_nickel;
	public static Item machete_platinum;
	public static Item machete_aluminum;
	public static Item machete_mithril;
	public static Item mortar_and_pestle;
	public static void config(FMLPreInitializationEvent event)
	{
		Configuration config=new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		Max_Damage_Wood=config.get("Tools max Damage","wood",60).getInt();
		Max_Damage_Stone=config.get("Tools max Damage","stone",120).getInt();
		Max_Damage_Iron=config.get("Tools max Damage","iron",240).getInt();
		Max_Damage_Gold=config.get("Tools max Damage","gold",30).getInt();
		Max_Damage_Diamond=config.get("Tools max Damage","diamond",1500).getInt();
		Max_Damage_Tin=config.get("Tools max Damage","tin",30).getInt();
		Max_Damage_Copper=config.get("Tools max Damage","copper",30).getInt();
		Max_Damage_Silver=config.get("Tools max Damage","silver",60).getInt();
		Max_Damage_Lead=config.get("Tools max Damage","lead",30).getInt();
		Max_Damage_Nickel=config.get("Tools max Damage","nickel",60).getInt();
		Max_Damage_Platinum=config.get("Tools max Damage","platinum",1000).getInt();
		Max_Damage_Aluminum=config.get("Tools max Damage","aluminum",30).getInt();
		Max_Damage_Mithril=config.get("Tools max Damage","mithril",2000).getInt();
		genores=config.get("Generate Ores","ore_gen",false).getBoolean(false);
		config.save();
	}
	public static void init()
	{
		item_seed=(new Items("item_seed"));
		item_sodium=(new Items("item_sodium"));
		item_sulfur=(new Items("item_sulfur"));
		item_handel=(new Items("item_handel"));
		item_rock=(new Items("item_rock"));
		item_dynamite=(new Items("item_dynamite"));
		item_grenade=(new Items("item_grenade").setMaxDamage(30));
		gem_certus_quartz=(new Items("gem_certus_quartz"));
		gem_sapphire=(new Items("gem_sapphire"));
		gem_ruby=(new Items("gem_ruby"));
		gem_peridot=(new Items("gem_peridot"));
		ingot_tin=(new Items("ingot_tin"));
		ingot_copper=(new Items("ingot_copper"));
		ingot_silver=(new Items("ingot_silver"));
		ingot_lead=(new Items("ingot_lead"));
		ingot_nickel=(new Items("ingot_nickel"));
		ingot_platinum=(new Items("ingot_platinum"));
		ingot_aluminum=(new Items("ingot_aluminum"));
		ingot_mithril=(new Items("ingot_mithril"));
		ingot_cobalt=(new Items("ingot_cobalt"));
		ingot_ardite=(new Items("ingot_ardite"));
		ingot_yellorium=(new Items("ingot_yellorium"));
		dust_iron=(new Items("dust_iron"));
		dust_gold=(new Items("dust_gold"));
		dust_tin=(new Items("dust_tin"));
		dust_copper=(new Items("dust_copper"));
		dust_silver=(new Items("dust_silver"));
		dust_lead=(new Items("dust_lead"));
		dust_nickel=(new Items("dust_nickel"));
		dust_platinum=(new Items("dust_platinum"));
		dust_aluminum=(new Items("dust_aluminum"));
		dust_mithril=(new Items("dust_mithril"));
		dust_cobalt=(new Items("dust_cobalt"));
		dust_ardite=(new Items("dust_ardite"));
		dust_yellorium=(new Items("dust_yellorium"));
		dust_flour=(new Items("dust_flour"));
		dust_sodium=(new Items("dust_sodium"));
		dust_sulfur=(new Items("dust_sulfur"));
		dust_charcoal=(new Items("dust_charcoal"));
		lump_clean_iron=(new ItemWork("lump_clean_iron",2,dust_iron));
		lump_clean_gold=(new ItemWork("lump_clean_gold",2,dust_gold));
		lump_clean_tin=(new ItemWork("lump_clean_tin",2,dust_tin));
		lump_clean_copper=(new ItemWork("lump_clean_copper",2,dust_copper));
		lump_clean_silver=(new ItemWork("lump_clean_silver",2,dust_silver));
		lump_clean_lead=(new ItemWork("lump_clean_lead",2,dust_lead));
		lump_clean_nickel=(new ItemWork("lump_clean_nickel",2,dust_nickel));
		lump_clean_platinum=(new ItemWork("lump_clean_platinum",2,dust_platinum));
		lump_clean_aluminum=(new ItemWork("lump_clean_aluminum",2,dust_aluminum));
		lump_clean_mithril=(new ItemWork("lump_clean_mithril",2,dust_mithril));
		lump_clean_cobalt=(new ItemWork("lump_clean_cobalt",2,dust_cobalt));
		lump_clean_ardite=(new ItemWork("lump_clean_ardite",2,dust_ardite));
		lump_clean_yellorium=(new ItemWork("lump_clean_yellorium",2,dust_yellorium));
		lump_iron=(new ItemWork("lump_iron",1,lump_clean_iron));
		lump_gold=(new ItemWork("lump_gold",1,lump_clean_gold));
		lump_tin=(new ItemWork("lump_tin",1,lump_clean_tin));
		lump_copper=(new ItemWork("lump_copper",1,lump_clean_copper));
		lump_silver=(new ItemWork("lump_silver",1,lump_clean_silver));
		lump_lead=(new ItemWork("lump_lead",1,lump_clean_lead));
		lump_nickel=(new ItemWork("lump_nickel",1,lump_clean_nickel));
		lump_platinum=(new ItemWork("lump_platinum",1,lump_clean_platinum));
		lump_aluminum=(new ItemWork("lump_aluminum",1,lump_clean_aluminum));
		lump_mithril=(new ItemWork("lump_mithril",1,lump_clean_mithril));
		lump_cobalt=(new ItemWork("lump_cobalt",1,lump_clean_cobalt));
		lump_ardite=(new ItemWork("lump_ardite",1,lump_clean_ardite));
		lump_yellorium=(new ItemWork("lump_yellorium",1,lump_clean_yellorium));
		chunk_iron=(new ItemWork("chunk_iron",0,lump_iron));
		chunk_gold=(new ItemWork("chunk_gold",0,lump_gold));
		chunk_tin=(new ItemWork("chunk_tin",0,lump_tin));
		chunk_copper=(new ItemWork("chunk_copper",0,lump_copper));
		chunk_silver=(new ItemWork("chunk_silver",0,lump_silver));
		chunk_lead=(new ItemWork("chunk_lead",0,lump_lead));
		chunk_nickel=(new ItemWork("chunk_nickel",0,lump_nickel));
		chunk_platinum=(new ItemWork("chunk_platinum",0,lump_platinum));
		chunk_aluminum=(new ItemWork("chunk_aluminum",0,lump_aluminum));
		chunk_mithril=(new ItemWork("chunk_mithril",0,lump_mithril));
		chunk_cobalt=(new ItemWork("chunk_cobalt",0,lump_cobalt));
		chunk_ardite=(new ItemWork("chunk_ardite",0,lump_ardite));
		chunk_yellorium=(new ItemWork("chunk_yellorium",0,lump_yellorium));
		chisel_wood=(new ItemChisel("wood",Max_Damage_Wood,1));
		chisel_stone=(new ItemChisel("stone",Max_Damage_Stone,2));
		chisel_iron=(new ItemChisel("iron",Max_Damage_Iron,3));
		chisel_gold=(new ItemChisel("gold",Max_Damage_Gold,1));
		chisel_diamond=(new ItemChisel("diamond",Max_Damage_Diamond,4));
		chisel_tin=(new ItemChisel("tin",Max_Damage_Tin,1));
		chisel_copper=(new ItemChisel("copper",Max_Damage_Copper,1));
		chisel_silver=(new ItemChisel("silver",Max_Damage_Silver,2));
		chisel_lead=(new ItemChisel("lead",Max_Damage_Lead,1));
		chisel_nickel=(new ItemChisel("nickel",Max_Damage_Nickel,2));
		chisel_platinum=(new ItemChisel("platinum",Max_Damage_Platinum,4));
		chisel_aluminum=(new ItemChisel("aluminum",Max_Damage_Aluminum,1));
		chisel_mithril=(new ItemChisel("mithril",Max_Damage_Mithril,5));
		sickle_wood=(new ItemSickle("wood",Max_Damage_Wood));
		sickle_stone=(new ItemSickle("stone",Max_Damage_Stone));
		sickle_iron=(new ItemSickle("iron",Max_Damage_Iron));
		sickle_gold=(new ItemSickle("gold",Max_Damage_Gold));
		sickle_diamond=(new ItemSickle("diamond",Max_Damage_Diamond));
		sickle_tin=(new ItemSickle("tin",Max_Damage_Tin));
		sickle_copper=(new ItemSickle("copper",Max_Damage_Copper));
		sickle_silver=(new ItemSickle("silver",Max_Damage_Silver));
		sickle_lead=(new ItemSickle("lead",Max_Damage_Lead));
		sickle_nickel=(new ItemSickle("nickel",Max_Damage_Nickel));
		sickle_platinum=(new ItemSickle("platinum",Max_Damage_Platinum));
		sickle_aluminum=(new ItemSickle("aluminum",Max_Damage_Aluminum));
		sickle_mithril=(new ItemSickle("mithril",Max_Damage_Mithril));
		machete_wood=(new ItemMachete("wood",Max_Damage_Wood,0,2.0F));
		machete_stone=(new ItemMachete("stone",Max_Damage_Stone,1,4.0F));
		machete_iron=(new ItemMachete("iron",Max_Damage_Iron,2,6.0F));
		machete_gold=(new ItemMachete("gold",Max_Damage_Gold,0,12.0F));
		machete_diamond=(new ItemMachete("diamond",Max_Damage_Diamond,3,8.0F));
		machete_tin=(new ItemMachete("tin",Max_Damage_Tin,0,2.0F));
		machete_copper=(new ItemMachete("copper",Max_Damage_Copper,0,2.0F));
		machete_silver=(new ItemMachete("silver",Max_Damage_Silver,1,4.0F));
		machete_lead=(new ItemMachete("lead",Max_Damage_Lead,0,2.0F));
		machete_nickel=(new ItemMachete("nickel",Max_Damage_Nickel,1,4.0F));
		machete_platinum=(new ItemMachete("platinum",Max_Damage_Platinum,3,8.0F));
		machete_aluminum=(new ItemMachete("aluminum",Max_Damage_Aluminum,0,2.0F));
		machete_mithril=(new ItemMachete("mithril",Max_Damage_Mithril,4,12.0F));
		mortar_and_pestle=(new ItemMortarAndPestle("mortar_and_pestle"));
	}
	public static void register()
	{
		GameRegistry.register(item_seed);
		GameRegistry.register(item_sodium);
		GameRegistry.register(item_sulfur);
		GameRegistry.register(item_handel);
		GameRegistry.register(item_rock);
		GameRegistry.register(item_dynamite);
		GameRegistry.register(item_grenade);
		GameRegistry.register(gem_certus_quartz);
		GameRegistry.register(gem_sapphire);
		GameRegistry.register(gem_ruby);
		GameRegistry.register(gem_peridot);
		GameRegistry.register(ingot_tin);
		GameRegistry.register(ingot_copper);
		GameRegistry.register(ingot_silver);
		GameRegistry.register(ingot_lead);
		GameRegistry.register(ingot_nickel);
		GameRegistry.register(ingot_platinum);
		GameRegistry.register(ingot_aluminum);
		GameRegistry.register(ingot_mithril);
		GameRegistry.register(ingot_cobalt);
		GameRegistry.register(ingot_ardite);
		GameRegistry.register(ingot_yellorium);
		GameRegistry.register(dust_iron);
		GameRegistry.register(dust_gold);
		GameRegistry.register(dust_tin);
		GameRegistry.register(dust_copper);
		GameRegistry.register(dust_silver);
		GameRegistry.register(dust_lead);
		GameRegistry.register(dust_nickel);
		GameRegistry.register(dust_platinum);
		GameRegistry.register(dust_aluminum);
		GameRegistry.register(dust_mithril);
		GameRegistry.register(dust_cobalt);
		GameRegistry.register(dust_ardite);
		GameRegistry.register(dust_yellorium);
		GameRegistry.register(dust_flour);
		GameRegistry.register(dust_sodium);
		GameRegistry.register(dust_sulfur);
		GameRegistry.register(dust_charcoal);
		GameRegistry.register(chunk_iron);
		GameRegistry.register(chunk_gold);
		GameRegistry.register(chunk_tin);
		GameRegistry.register(chunk_copper);
		GameRegistry.register(chunk_silver);
		GameRegistry.register(chunk_lead);
		GameRegistry.register(chunk_nickel);
		GameRegistry.register(chunk_platinum);
		GameRegistry.register(chunk_aluminum);
		GameRegistry.register(chunk_mithril);
		GameRegistry.register(chunk_cobalt);
		GameRegistry.register(chunk_ardite);
		GameRegistry.register(chunk_yellorium);
		GameRegistry.register(lump_iron);
		GameRegistry.register(lump_gold);
		GameRegistry.register(lump_tin);
		GameRegistry.register(lump_copper);
		GameRegistry.register(lump_silver);
		GameRegistry.register(lump_lead);
		GameRegistry.register(lump_nickel);
		GameRegistry.register(lump_platinum);
		GameRegistry.register(lump_aluminum);
		GameRegistry.register(lump_mithril);
		GameRegistry.register(lump_cobalt);
		GameRegistry.register(lump_ardite);
		GameRegistry.register(lump_yellorium);
		GameRegistry.register(lump_clean_iron);
		GameRegistry.register(lump_clean_gold);
		GameRegistry.register(lump_clean_tin);
		GameRegistry.register(lump_clean_copper);
		GameRegistry.register(lump_clean_silver);
		GameRegistry.register(lump_clean_lead);
		GameRegistry.register(lump_clean_nickel);
		GameRegistry.register(lump_clean_platinum);
		GameRegistry.register(lump_clean_aluminum);
		GameRegistry.register(lump_clean_mithril);
		GameRegistry.register(lump_clean_cobalt);
		GameRegistry.register(lump_clean_ardite);
		GameRegistry.register(lump_clean_yellorium);
		GameRegistry.register(chisel_wood);
		GameRegistry.register(chisel_stone);
		GameRegistry.register(chisel_iron);
		GameRegistry.register(chisel_gold);
		GameRegistry.register(chisel_diamond);
		GameRegistry.register(chisel_tin);
		GameRegistry.register(chisel_copper);
		GameRegistry.register(chisel_silver);
		GameRegistry.register(chisel_lead);
		GameRegistry.register(chisel_nickel);
		GameRegistry.register(chisel_platinum);
		GameRegistry.register(chisel_aluminum);
		GameRegistry.register(chisel_mithril);
		GameRegistry.register(sickle_wood);
		GameRegistry.register(sickle_stone);
		GameRegistry.register(sickle_iron);
		GameRegistry.register(sickle_gold);
		GameRegistry.register(sickle_diamond);
		GameRegistry.register(sickle_tin);
		GameRegistry.register(sickle_copper);
		GameRegistry.register(sickle_silver);
		GameRegistry.register(sickle_lead);
		GameRegistry.register(sickle_nickel);
		GameRegistry.register(sickle_platinum);
		GameRegistry.register(sickle_aluminum);
		GameRegistry.register(sickle_mithril);
		GameRegistry.register(machete_wood);
		GameRegistry.register(machete_stone);
		GameRegistry.register(machete_iron);
		GameRegistry.register(machete_gold);
		GameRegistry.register(machete_diamond);
		GameRegistry.register(machete_tin);
		GameRegistry.register(machete_copper);
		GameRegistry.register(machete_silver);
		GameRegistry.register(machete_lead);
		GameRegistry.register(machete_nickel);
		GameRegistry.register(machete_platinum);
		GameRegistry.register(machete_aluminum);
		GameRegistry.register(machete_mithril);
		GameRegistry.register(mortar_and_pestle);
	}
	public static void registerRenders()
	{
		registerRenders(item_seed);
		registerRenders(item_sodium);
		registerRenders(item_sulfur);
		registerRenders(item_handel);
		registerRenders(item_rock);
		registerRenders(item_dynamite);
		registerRenders(item_grenade);
		registerRenders(gem_certus_quartz);
		registerRenders(gem_sapphire);
		registerRenders(gem_ruby);
		registerRenders(gem_peridot);
		registerRenders(ingot_tin);
		registerRenders(ingot_copper);
		registerRenders(ingot_silver);
		registerRenders(ingot_lead);
		registerRenders(ingot_nickel);
		registerRenders(ingot_platinum);
		registerRenders(ingot_aluminum);
		registerRenders(ingot_mithril);
		registerRenders(ingot_cobalt);
		registerRenders(ingot_ardite);
		registerRenders(ingot_yellorium);
		registerRenders(dust_iron);
		registerRenders(dust_gold);
		registerRenders(dust_tin);
		registerRenders(dust_copper);
		registerRenders(dust_silver);
		registerRenders(dust_lead);
		registerRenders(dust_nickel);
		registerRenders(dust_platinum);
		registerRenders(dust_aluminum);
		registerRenders(dust_mithril);
		registerRenders(dust_cobalt);
		registerRenders(dust_ardite);
		registerRenders(dust_yellorium);
		registerRenders(dust_flour);
		registerRenders(dust_sodium);
		registerRenders(dust_sulfur);
		registerRenders(dust_charcoal);
		registerRenders(chunk_iron);
		registerRenders(chunk_gold);
		registerRenders(chunk_tin);
		registerRenders(chunk_copper);
		registerRenders(chunk_silver);
		registerRenders(chunk_lead);
		registerRenders(chunk_nickel);
		registerRenders(chunk_platinum);
		registerRenders(chunk_aluminum);
		registerRenders(chunk_mithril);
		registerRenders(chunk_cobalt);
		registerRenders(chunk_ardite);
		registerRenders(chunk_yellorium);
		registerRenders(lump_iron);
		registerRenders(lump_gold);
		registerRenders(lump_tin);
		registerRenders(lump_copper);
		registerRenders(lump_silver);
		registerRenders(lump_lead);
		registerRenders(lump_nickel);
		registerRenders(lump_platinum);
		registerRenders(lump_aluminum);
		registerRenders(lump_mithril);
		registerRenders(lump_cobalt);
		registerRenders(lump_ardite);
		registerRenders(lump_yellorium);
		registerRenders(lump_clean_iron);
		registerRenders(lump_clean_gold);
		registerRenders(lump_clean_tin);
		registerRenders(lump_clean_copper);
		registerRenders(lump_clean_silver);
		registerRenders(lump_clean_lead);
		registerRenders(lump_clean_nickel);
		registerRenders(lump_clean_platinum);
		registerRenders(lump_clean_aluminum);
		registerRenders(lump_clean_mithril);
		registerRenders(lump_clean_cobalt);
		registerRenders(lump_clean_ardite);
		registerRenders(lump_clean_yellorium);
		registerRenders(chisel_wood);
		registerRenders(chisel_stone);
		registerRenders(chisel_iron);
		registerRenders(chisel_gold);
		registerRenders(chisel_diamond);
		registerRenders(chisel_tin);
		registerRenders(chisel_copper);
		registerRenders(chisel_silver);
		registerRenders(chisel_lead);
		registerRenders(chisel_nickel);
		registerRenders(chisel_platinum);
		registerRenders(chisel_aluminum);
		registerRenders(chisel_mithril);
		registerRenders(sickle_wood);
		registerRenders(sickle_stone);
		registerRenders(sickle_iron);
		registerRenders(sickle_gold);
		registerRenders(sickle_diamond);
		registerRenders(sickle_tin);
		registerRenders(sickle_copper);
		registerRenders(sickle_silver);
		registerRenders(sickle_lead);
		registerRenders(sickle_nickel);
		registerRenders(sickle_platinum);
		registerRenders(sickle_aluminum);
		registerRenders(sickle_mithril);
		registerRenders(machete_wood);
		registerRenders(machete_stone);
		registerRenders(machete_iron);
		registerRenders(machete_gold);
		registerRenders(machete_diamond);
		registerRenders(machete_tin);
		registerRenders(machete_copper);
		registerRenders(machete_silver);
		registerRenders(machete_lead);
		registerRenders(machete_nickel);
		registerRenders(machete_platinum);
		registerRenders(machete_aluminum);
		registerRenders(machete_mithril);
		registerRenders(mortar_and_pestle);
	}
	private static void registerRenders(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
}