package application;

import java.time.LocalDate;

public class Ladies {
	
	//Simpleton class
	private static Ladies obj;
	private Ladies() {
		
	}
	public static Ladies getObject() {
		if(obj == null) {
			obj = new Ladies();
		}
		return obj;
	}
	
	//Type of clothing
	private String TypeOfClothing;
	
	//Type of Material
	private String ClothingMaterial;
	
	//Type of Design
	private String TypeOfDesign;
	
	//counter variable for back
	public static int counter = 0;
	
	//Measurements
	private double ShoulderWidth;
	private double NeckSize;
	private double ArmLength;
	private double ArmSize;
	private double HipLength;
	private double WaistLength;
	private double TorsoLength;
	private double NeckDepth;
	private double BackLength;
	private double ArmScye;
	private double BustSize;
	private double Waist;
	private double LengthOfGarment;
	private double BackSize;
	private double InSeam;
	private double Thigh;
	
	//Price
	public static int Price = 0;
    public static int expressDeliveryCharge = 0;
	
	
	//Personal details
	public static String CustomerName;
	public static String CustomerAddress;
	public static String CustomerEmailAddress;
	public static int CustomerPhoneNumber ;
	public static int CustomerBkashNumber ;
	public static LocalDate CustomerDeliveryDate;
	
	//SettersGetters for Type of Clothing
	public String getTypeOfClothing() {
		return TypeOfClothing;
	}
	public void setTypeOfDesign(String TypeOfDesign) {
		this.TypeOfDesign = TypeOfDesign;
	}
	
	//SettersGetters for Type of Material
	public String getClothingMaterial() {
		return ClothingMaterial;
	}
	public void setClothingMaterial(String ClothingMaterial) {
		this.ClothingMaterial = ClothingMaterial;
	}
	
	//SettersGetters for Type of Clothing
	public String getTypeOfDesign() {
		return TypeOfDesign;
	}
		public void setTypeOfClothing(String TypeOfClothing) {
			this.TypeOfClothing = TypeOfClothing;
		}
	
	//SettersGetters for Measurements
	public void setShoulderWidth(double ShoulderWidth) {
		this.ShoulderWidth = ShoulderWidth;
	}
	public double getShoulderWidth() {
		return ShoulderWidth;
	}
	public void setNeckSize(double NeckSize) {
		this.NeckSize = NeckSize;
	}
	public double getNeckSize() {
		return NeckSize;
	}
	public void setArmLength(double ArmLength) {
		this.ArmLength = ArmLength;
	}
	public double getArmLength() {
		return ArmLength;
	}
	public void setArmSize(double ArmSize) {
		this.ArmSize = ArmSize;
	}
	public double getArmSize() {
		return ArmSize;
	}
	public void setHipLength(double HipLength) {
		this.HipLength = HipLength;
	}
	public double getHipLength() {
		return HipLength;
	}
	public void setWaistLength(double WaistLength) {
		this.WaistLength = WaistLength;
	}
	public double getWaistLength() {
		return WaistLength;
	}
	public void setTorsoLength(double TorsoLength) {
		this.TorsoLength = TorsoLength;
	}
	public double getTorsoLength() {
		return TorsoLength;
	}
	public void setNeckDepth(double NeckDepth) {
		this.NeckDepth = NeckDepth;
	}
	public double getNeckDepth() {
		return NeckDepth;
	}
	public void setBackLength(double BackLength) {
		this.BackLength = BackLength;
	}
	public double getBackLength() {
		return BackLength;
	}
	public void setArmScye(double ArmScye) {
		this.ArmScye = ArmScye;
	}
	public double getArmScye() {
		return ArmScye;
	}
	public void setBustSize(double BustSize) {
		this.BustSize = BustSize;
	}
	public double getBustSize() {
		return BustSize;
	}
	public void setWaist(double Waist) {
		this.Waist = Waist;
	}
	public double getWaist() {
		return Waist;
	}
	public void setLengthOfGarment(double LengthOfGarment) {
		this.LengthOfGarment = LengthOfGarment;
	}
	public double getLengthOfGarment() {
		return LengthOfGarment;
	}
	public void setBackSize(double BackSize) {
		this.BackSize = BackSize;
	}
	public double getBackSize() {
		return BackSize;
	}
	public void setInSeam(double InSeam) {
		this.InSeam = InSeam;
	}
	public double getInSeam() {
		return InSeam;
	}
	public void setThigh(double Thigh) {
		this.Thigh = Thigh;
	}
	public double getThigh() {
		return Thigh;
	}
	
}