package dev.patika.vetapp.base;

public enum City {
    ADANA(1),
    ADIYAMAN(2),
    AFYONKARAHISAR(3),
    AGRI(4),
    // ... diğer şehirler
    ZONGULDAK(67),
    AKSARAY(68),
    BAYBURT(69),
    KARAMAN(70),
    KIRIKKALE(71),
    BATMAN(72),
    SIRNAK(73),
    BARTIN(74),
    ARDAHAN(75),
    IGDIR(76),
    YALOVA(77),
    KARABUK(78),
    KILIS(79),
    OSMANIYE(80),
    DUZCE(81);

    private final int plateCode;

    City(int plateCode) {
        this.plateCode = plateCode;
    }

    public int getPlateCode() {
        return plateCode;
    }
}