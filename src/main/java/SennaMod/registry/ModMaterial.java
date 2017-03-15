package SennaMod.registry;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterial
{
	//Armmor Material
	//addArmorMaterial(アーマーマテリアルの名前・耐久値・部位ごとの防御力・エンチャントの付きやすさ)
	public static ArmorMaterial sennaArmor_Mat = EnumHelper.addArmorMaterial("SENNA_ARMOR", 100, new int[] {5, 9, 5, 3}, 10);
	public static ArmorMaterial blackSennaArmor_Mat = EnumHelper.addArmorMaterial("BLACK_SENNA_ARMOR", 100, new int[] {5, 10, 6, 4}, 15);

	//Sword Material
	//addToolMaterial(ツールマテリアルの名前, 回収レベル, 最大耐久値, 採掘速度, 攻撃に使用したときのダメージ倍率(4を引く), エンチャントの付きやすさ)
	public static ToolMaterial torchword = EnumHelper.addToolMaterial("TORCH_SWORD"			, 3, 1500, 8.0F, 3.0F, 10);
	public static ToolMaterial calanuumSword = EnumHelper.addToolMaterial("CALANIUM_SWORD"	, 3, 1500, 8.0F, 4.0F, 15);
	public static ToolMaterial floniumSword = EnumHelper.addToolMaterial("FLONIUM_SWORD"		, 3, 2100, 8.5F, 16.0F, 20);
	public static ToolMaterial elugniteSword = EnumHelper.addToolMaterial("ELUGNITE_SWORD"	, 3, 3500, 9.0F, 31.0F, 30);
	public static ToolMaterial julniteSword = EnumHelper.addToolMaterial("JULNTIE_SWORD"		, 3, 4500, 10.0F, 76.0F, 35);
	public static ToolMaterial OraziSword = EnumHelper.addToolMaterial("ORAZI_SWORD"			, 3, 5500, 13.0F, 146.0F, 40);

	//Tool Material
	//addToolMaterial(ツールマテリアルの名前, 回収レベル, 最大耐久値, 採掘速度, 攻撃に使用したときのダメージ倍率(4を引く), エンチャントの付きやすさ)
	public static ToolMaterial calanuumTool = EnumHelper.addToolMaterial("CALANIUM_TOOL"	, 3, 1500, 10.0F, 3.0F, 15);
	public static ToolMaterial floniumTool = EnumHelper.addToolMaterial("FLONIUM_TOOL"	, 3, 2100, 15.0F, 3.0F, 20);
	public static ToolMaterial elugniteTool = EnumHelper.addToolMaterial("ELUGNITE_TOOL"	, 3, 3500, 25.0F, 3.0F, 30);
	public static ToolMaterial julniteTool = EnumHelper.addToolMaterial("JULNTIE_TOOL"	, 3, 4500, 30.0F, 3.0F, 35);
	public static ToolMaterial OraziTool = EnumHelper.addToolMaterial("ORAZI_TOOL"		, 3, 5500, 40.0F, 3.0F, 40);

}
