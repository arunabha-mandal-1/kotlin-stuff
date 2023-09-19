fun main() {
    val listView = ListView(arrayOf("Arunabha", "Kittu", "Samrat", "Babai"))
    listView.ListViewItem().displayItem(0)
}

/*
*Inner classes:  Classes which are declared inside another classes.
*                When there is a very close relationship between two classes,
*                and it does not make sense to put two classes separated then we
*                use inner classes.
* */


class ListView(val items: Array<String>) {
    inner class ListViewItem() {
        // inner classes have access properties of outer classes
        fun displayItem(position: Int){
            println(items[position])
        }
    }
}