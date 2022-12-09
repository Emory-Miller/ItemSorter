package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    IdComparator id = new IdComparator();
    NameComparator name = new NameComparator();
    PriceComparator price = new PriceComparator();
    Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        if ( comparator.getClass() == id.getClass()) {
            Arrays.sort(this.items, id);
        } else if(  comparator.getClass() == name.getClass()) {
            Arrays.sort(items, name);
        } else if (  comparator.getClass() == price.getClass()) {
            Arrays.sort(items, price);
        }
        return this.items;
    }

}
