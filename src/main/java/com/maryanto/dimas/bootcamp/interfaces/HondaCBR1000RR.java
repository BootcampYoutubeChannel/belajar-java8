package com.maryanto.dimas.bootcamp.interfaces;

public class HondaCBR1000RR implements SportBikes {

    public String getManufacture() {
        return "Honda";
    }

    public String getCaliper() {
        return "Brembo RCX";
    }

    public String getMaster() {
        return "Acosato";
    }

    public Integer getCylinder() {
        return 4;
    }

    public String getConfiguration() {
        return "Inline 4";
    }

    public String toString() {
        return String.format(
            "{ manufacture: %s, jumlah cylinder: %d, konfigurasi mesin: %s, system pengereman: %s}",
            this.getManufacture(), this.getCylinder(), this.getConfiguration(), this.getCaliper());
    }
}