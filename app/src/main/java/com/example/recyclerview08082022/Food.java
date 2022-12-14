package com.example.recyclerview08082022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Food {
    public final static String instance = "Food Class";
    private int image;
    private String name;
    private String address;
    private List<CategoryEnum> categoryEnums;
    private String saleOff;
    private float distance;
    private int hourOpenTime;
    private int minuteOpenTime;
    private int hourCloseTime;
    private int minuteCloseTime;

    public Food(int image, String name, String address, List<CategoryEnum> categoryEnums, String saleOff, float distance, int hourOpenTime, int minutesOpenTime, int hourCloseTime, int minutesCloseTime) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.categoryEnums = categoryEnums;
        this.saleOff = saleOff;
        this.distance = distance;
        this.hourOpenTime = hourOpenTime;
        this.minuteOpenTime = minutesOpenTime;
        this.hourCloseTime = hourCloseTime;
        this.minuteCloseTime = minutesCloseTime;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CategoryEnum> getCategoryEnums() {
        return categoryEnums;
    }

    public void setCategoryEnums(List<CategoryEnum> categoryEnums) {
        this.categoryEnums = categoryEnums;
    }

    public String getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(String saleOff) {
        this.saleOff = saleOff;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getHourOpenTime() {
        return hourOpenTime;
    }

    public void setHourOpenTime(int hourOpenTime) {
        this.hourOpenTime = hourOpenTime;
    }

    public int getMinuteOpenTime() {
        return minuteOpenTime;
    }

    public void setMinuteOpenTime(int minuteOpenTime) {
        this.minuteOpenTime = minuteOpenTime;
    }

    public int getHourCloseTime() {
        return hourCloseTime;
    }

    public void setHourCloseTime(int hourCloseTime) {
        this.hourCloseTime = hourCloseTime;
    }

    public int getMinuteCloseTime() {
        return minuteCloseTime;
    }

    public void setMinuteCloseTime(int minuteCloseTime) {
        this.minuteCloseTime = minuteCloseTime;
    }
    public static List<Food> getMock() {
        return new ArrayList<>(Arrays.asList(
                new Food(R.drawable.foody_restaurant_sanfulou, "San Fu Lou - ???m Th???c Qu???ng ????ng - L?? Lai", "T???ng Tr???t, AB Tower, 76A L?? Lai, P. B???n Th??nh,  Qu???n 1, TP. HCM", Arrays.asList(CategoryEnum.RESTAURANT), "Buoi sang - 10%", 15f, 7, 0, 10, 10),
                new Food(R.drawable.foody_ut_ut_quan, "Qu??n ???t ???t - Barbecue & Beer - V?? V??n Ki???t", "168 V?? V??n Ki???t, P. C???u ??ng L??nh,  Qu???n 1, TP. HCM", Arrays.asList(), "Buoi toi - 20%", 18f, 11, 0, 24, 0),
                new Food(R.drawable.foody_restaurant_fuji, "Fuji Japanese Restaurant ?????? - Nikko Saigon Hotel", "T???ng Tr???t Nikko Saigon Hotel, 235 Nguy???n V??n C???, P. Ph???m Ng?? L??o,  Qu???n 1, TP. HCM", Arrays.asList(CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Kh??ng c?? ??u ????i", 14.7f, 10, 18, 19, 11),
                new Food(R.drawable.foody_buffet_sabusabu, "Shabu Ya - SC VivoCity", "T???ng 4 - SC VivoCity, 1058 Nguy???n V??n Linh, KP. 1, P. T??n Phong,  Qu???n 7, TP. HCM", Arrays.asList(CategoryEnum.BUFFET, CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Ca ngay 15%", 28.4f, 9, 5, 22, 1),
                new Food(R.drawable.foody_buffet_hana_bbq_and_hot_pot, "Hana BBQ & Hot Pot Buffet - Nguy???n Qu?? ?????c", "65 Nguy???n Qu?? ?????c, P. An Ph??,  Qu???n 2, TP. HCM", Arrays.asList(CategoryEnum.BUFFET, CategoryEnum.RESTAURANT, CategoryEnum.FAMILY), "Buoi sang 10%", 13.2f, 8, 5, 22, 5),
                new Food(R.drawable.foody_restaurant_kvegetarian, "Qu??n Chay KVegetarian - B??nh Th???nh", "20/15 Phan ????ng L??u, P. 6,  Qu???n B??nh Th???nh, TP. HCM", Arrays.asList(CategoryEnum.RESTAURANT, CategoryEnum.FAMILY, CategoryEnum.GROUP), "Kh??ng c?? ??u ????i", 7.3f, 9, 3, 21, 2),
                new Food(R.drawable.foody_streetfood_223flan, "Qu??n 223 - B??nh Flan Th???p C???m", "223 Tr???n B??nh Tr???ng,  Qu???n 5, TP. HCM", Arrays.asList(CategoryEnum.STREET_FOOD, CategoryEnum.SHOP_ONLINE, CategoryEnum.GROUP), "Kh??ng c?? ??u ????i", 20f, 11, 59, 21, 58),
                new Food(R.drawable.foody_streetfood_banh_mi_bo_a_tung, "A T??ng - B??nh M?? B?? N?????ng B?? Cambodia - C???ng Qu???nh", "171 C???ng Qu???nh,  Qu???n 1, TP. HCM", Arrays.asList(CategoryEnum.STREET_FOOD, CategoryEnum.SHOP_ONLINE, CategoryEnum.GROUP), "Kh??ng c?? ??u ????i", 11f, 14, 32, 21, 13),
                new Food(R.drawable.foody_shop_online_bep_rua, "B???p R??a - Ch??n G?? R??t X????ng Ng??m S??? T???c - Shop Online", "127/5/9 L?? Th??c Ho???ch, P. Ph?? Th??? H??a,  Qu???n T??n Ph??, TP. HCM", Arrays.asList(CategoryEnum.SHOP_ONLINE, CategoryEnum.GROUP, CategoryEnum.FAMILY), "Ca ngay 10%", 20f, 5, 9, 24, 0),
                new Food(R.drawable.foody_shop_online_bep_9_sach, "B??nh 9 S???ch - B??nh S???u Ri??ng - Shop Online", "73 An D????ng V????ng, P. 8,  Qu???n 5, TP. HCM", Arrays.asList(CategoryEnum.SHOP_ONLINE, CategoryEnum.GROUP, CategoryEnum.FAMILY), "Ca ngay 5%", 16f, 8, 0, 18, 6))
        );
    }

}