package com.maryanto.dimas.bootcamp.interfaces;

public class KawasakiZx10R implements SportBikes {

    public String getManufacture() {
        return "Kawasaki";
    }

    public String getCaliper() {
        return "Nissin";
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