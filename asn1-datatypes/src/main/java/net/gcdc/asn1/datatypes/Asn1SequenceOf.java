package net.gcdc.asn1.datatypes;

import java.util.*;

/**
 * Class to represent ASN.1 construct "SEQUENCE OF".
 * <p>
 * Extending classes should specify concrete types for {@code T}, generic collections can't be decoded (yet?).
 * <p>
 * Usage example:
 * <PRE>
 * <code>
 * {@literal @}Sequence
 * public class Person {
 * {@literal @}IntRange(minValue=0, maxValue=100, hasExtensionMarker=true)
 * int age;
 * Children children;
 * }
 * public class Children extends Asn1SequenceOf&lt;ChildInformation&gt; {
 * public Children() { super(); }
 * public Children(Collection&lt;ChildInformation&gt; coll) { super(coll); }
 * }
 * </code>
 * </PRE>
 *
 * <p>
 * Actually, UPER decoder and encoder consider anything that extends {@code List<T>} as a SEQUENCE OF.
 *
 * @param <T> type of elements contained.
 * @author zhangyong
 */
public abstract class Asn1SequenceOf<T> extends AbstractList<T> {

    protected final List<T> bakingList;

    public Asn1SequenceOf() {
        this(new ArrayList<T>());
    }

    public Asn1SequenceOf(Collection<T> coll) {
        bakingList = new ArrayList<>(coll);
    }

    @Override
    public T get(int index) {
        return bakingList.get(index);
    }

    @Override
    public int size() {
        return bakingList.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Asn1SequenceOf<?> that = (Asn1SequenceOf<?>) o;
        return Objects.equals(bakingList, that.bakingList);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(bakingList);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bakingList);
    }
}
