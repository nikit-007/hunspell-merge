// $Id: AffixFlag.java 25 2012-12-09 05:13:12Z serg.barbery@gmail.com $

package hunspell.merge;

public enum AffixFlag {
  SINGLE(""),
  LONG("LONG"),
  NUMBER("NUMBER");

  private String name;

  AffixFlag(String name) {
    this.name = name;
  }

  public static AffixFlag parse(String value) {
    for (AffixFlag t : AffixFlag.values()) {
      if (t.compare(value))
        return t;
    }
    return SINGLE;
  }

  private boolean compare(String name) {
    return this.name.equalsIgnoreCase(name);
  }

  public String getName() {
    return name;
  }
}
