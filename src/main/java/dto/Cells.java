package dto;

import java.util.ArrayList;

public class Cells {
    private float global_id;
    private String ObjectName;
    private String NameWinter;
    ArrayList< Object > PhotoWinter = new ArrayList < Object > ();
    private String AdmArea;
    private String District;
    private String Address;
    private String Email;
    private String WebSite;
    private String HelpPhone;
    private String HelpPhoneExtension = null;
    ArrayList < Object > WorkingHoursWinter = new ArrayList < Object > ();
    private String ClarificationOfWorkingHoursWinter = null;
    private String HasEquipmentRental;
    private String EquipmentRentalComments = null;
    private String HasTechService;
    private String TechServiceComments = null;
    private String HasDressingRoom;
    private String HasEatery;
    private String HasToilet;
    private String HasWifi;
    private String HasCashMachine;
    private String HasFirstAidPost;
    private String HasMusic;
    private String UsagePeriodWinter;
    ArrayList < Object > DimensionsWinter = new ArrayList< Object >();
    private String Lighting;
    private String SurfaceTypeWinter;
    private float Seats;
    private String Paid;
    private String PaidComments = null;
    private String DisabilityFriendly;
    ArrayList < Object > ServicesWinter = new ArrayList < Object > ();
    GeoData GeoDataObject;


    // Getter Methods

    public float getGlobal_id() {
        return global_id;
    }

    public String getObjectName() {
        return ObjectName;
    }

    public String getNameWinter() {
        return NameWinter;
    }

    public String getAdmArea() {
        return AdmArea;
    }

    public String getDistrict() {
        return District;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }

    public String getWebSite() {
        return WebSite;
    }

    public String getHelpPhone() {
        return HelpPhone;
    }

    public String getHelpPhoneExtension() {
        return HelpPhoneExtension;
    }

    public String getClarificationOfWorkingHoursWinter() {
        return ClarificationOfWorkingHoursWinter;
    }

    public String getHasEquipmentRental() {
        return HasEquipmentRental;
    }

    public String getEquipmentRentalComments() {
        return EquipmentRentalComments;
    }

    public String getHasTechService() {
        return HasTechService;
    }

    public String getTechServiceComments() {
        return TechServiceComments;
    }

    public String getHasDressingRoom() {
        return HasDressingRoom;
    }

    public String getHasEatery() {
        return HasEatery;
    }

    public String getHasToilet() {
        return HasToilet;
    }

    public String getHasWifi() {
        return HasWifi;
    }

    public String getHasCashMachine() {
        return HasCashMachine;
    }

    public String getHasFirstAidPost() {
        return HasFirstAidPost;
    }

    public String getHasMusic() {
        return HasMusic;
    }

    public String getUsagePeriodWinter() {
        return UsagePeriodWinter;
    }

    public String getLighting() {
        return Lighting;
    }

    public String getSurfaceTypeWinter() {
        return SurfaceTypeWinter;
    }

    public float getSeats() {
        return Seats;
    }

    public String getPaid() {
        return Paid;
    }

    public String getPaidComments() {
        return PaidComments;
    }

    public String getDisabilityFriendly() {
        return DisabilityFriendly;
    }

    public GeoData getGeoData() {
        return GeoDataObject;
    }

    // Setter Methods

    public void setGlobal_id(float global_id) {
        this.global_id = global_id;
    }

    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    public void setNameWinter(String NameWinter) {
        this.NameWinter = NameWinter;
    }

    public void setAdmArea(String AdmArea) {
        this.AdmArea = AdmArea;
    }

    public void setDistrict(String District) {
        this.District = District;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setWebSite(String WebSite) {
        this.WebSite = WebSite;
    }

    public void setHelpPhone(String HelpPhone) {
        this.HelpPhone = HelpPhone;
    }

    public void setHelpPhoneExtension(String HelpPhoneExtension) {
        this.HelpPhoneExtension = HelpPhoneExtension;
    }

    public void setClarificationOfWorkingHoursWinter(String ClarificationOfWorkingHoursWinter) {
        this.ClarificationOfWorkingHoursWinter = ClarificationOfWorkingHoursWinter;
    }

    public void setHasEquipmentRental(String HasEquipmentRental) {
        this.HasEquipmentRental = HasEquipmentRental;
    }

    public void setEquipmentRentalComments(String EquipmentRentalComments) {
        this.EquipmentRentalComments = EquipmentRentalComments;
    }

    public void setHasTechService(String HasTechService) {
        this.HasTechService = HasTechService;
    }

    public void setTechServiceComments(String TechServiceComments) {
        this.TechServiceComments = TechServiceComments;
    }

    public void setHasDressingRoom(String HasDressingRoom) {
        this.HasDressingRoom = HasDressingRoom;
    }

    public void setHasEatery(String HasEatery) {
        this.HasEatery = HasEatery;
    }

    public void setHasToilet(String HasToilet) {
        this.HasToilet = HasToilet;
    }

    public void setHasWifi(String HasWifi) {
        this.HasWifi = HasWifi;
    }

    public void setHasCashMachine(String HasCashMachine) {
        this.HasCashMachine = HasCashMachine;
    }

    public void setHasFirstAidPost(String HasFirstAidPost) {
        this.HasFirstAidPost = HasFirstAidPost;
    }

    public void setHasMusic(String HasMusic) {
        this.HasMusic = HasMusic;
    }

    public void setUsagePeriodWinter(String UsagePeriodWinter) {
        this.UsagePeriodWinter = UsagePeriodWinter;
    }

    public void setLighting(String Lighting) {
        this.Lighting = Lighting;
    }

    public void setSurfaceTypeWinter(String SurfaceTypeWinter) {
        this.SurfaceTypeWinter = SurfaceTypeWinter;
    }

    public void setSeats(float Seats) {
        this.Seats = Seats;
    }

    public void setPaid(String Paid) {
        this.Paid = Paid;
    }

    public void setPaidComments(String PaidComments) {
        this.PaidComments = PaidComments;
    }

    public void setDisabilityFriendly(String DisabilityFriendly) {
        this.DisabilityFriendly = DisabilityFriendly;
    }

    public void setGeoData(GeoData geoDataObject) {
        this.GeoDataObject = geoDataObject;
    }
}
