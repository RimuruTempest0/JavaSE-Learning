public class StringHideInfoPractive {
    public static void main (String[] args){
        String ID = "140502197603294014";

        String year = ID.substring(6,10);
        String month = ID.substring(10,12);
        String day = ID.substring(12,14);
        String sex;
        if((ID.charAt(ID.length()-1) - 30) % 2 == 0){
            sex = "Female";
        } else {
            sex = "Male";
        }
        System.out.println(year+" year "+month+" month "+day+" day");
        System.out.println("Sex is: " + sex);

        String talk = "别玩了，NMD";
        String sensitiveString = talk.replace("NMD","***");
        System.out.println(sensitiveString);
    }
}
