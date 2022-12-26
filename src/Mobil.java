public class Mobil {
  String tipe;
  String merk;
  int tahun;

  public Mobil(String merk, String tipe, int tahun) {
    this.tipe = tipe;
    this.merk = merk;
    this.tahun = tahun;
  }
  @Override
  public String toString() {
    return this.merk + " " + this.tipe + " (" + this.tahun + ")";
  }

  @Override public boolean equals(Object obj)
  {

    if (this == obj)
      return true;

    if (obj == null
            || this.getClass() != obj.getClass())
      return false;

    Mobil p1 = (Mobil) obj; // type casting object to the
    // intended class type

    // checking if the two
    // objects share all the same values
    return this.merk.equals(p1.merk)
            && this.tahun == p1.tahun
            && this.tipe.equals(p1.tipe);
  }
}

