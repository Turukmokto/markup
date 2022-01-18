package markup;

import java.util.List;

abstract class AbstractList extends AbstractElement implements MyList {
    public AbstractList(List<ListItem> listItems) {
        super(listItems);
    }
}
