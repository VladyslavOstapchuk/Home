package JAVA.Practice.Object;

import java.util.Objects;

public class SimpleObject {
    private int field;

    //Object's methods are marked by |

    public SimpleObject(int field) {
        this.field = field;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    // |
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleObject that = (SimpleObject) o;
        return field == that.field;
    }

    // |
    @Override
    public int hashCode() {
        return Objects.hash(field);
    }

    // |
    @Override
    public String toString() {
        return "\nSimple object" + "\nField =" + field;
    }
}
