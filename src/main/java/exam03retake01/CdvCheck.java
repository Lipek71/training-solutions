package exam03retake01;

public class CdvCheck {

    public boolean check(String cdv) {
        final String NUMBERS = "0123456789";
        boolean cdvReal = false;
        if (cdv.length() != 10) {
            throw new IllegalArgumentException("Not enough numbers!");
        }
        for (int i = 0; i < cdv.length(); i++) {
            if (!NUMBERS.contains(cdv.substring(i, i + 1))) {
                throw new IllegalArgumentException("Not only numbers!");
            }
        }

        int checksum = 0;
        for (int i = 0; i < cdv.length() - 1; i++) {
            checksum += Integer.parseInt(cdv.substring(i, i + 1)) * (i + 1);
        }
        if (checksum % 11 == Integer.parseInt(cdv.substring(9, 10))) {
            cdvReal = true;
        }
        return cdvReal;
    }

}
