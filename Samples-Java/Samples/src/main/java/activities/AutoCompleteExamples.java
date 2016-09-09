package activities;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import fragments.autocomplete.AutoCompleteGettingStartedFragment;
import fragments.autocomplete.AutoCompleteTokensFragment;
import fragments.listview.ListViewCollapsibleFragment;
import fragments.listview.ListViewDataOperationsFragment;
import fragments.listview.ListViewDeckOfCardsFragment;
import fragments.listview.ListViewGettingStartedFragment;
import fragments.listview.ListViewItemAnimationFragment;
import fragments.listview.ListViewLayoutsFragment;
import fragments.listview.ListViewLoadOnDemandFragment;
import fragments.listview.ListViewReorderFragment;
import fragments.listview.ListViewSelectionFragment;
import fragments.listview.ListViewSlideFragment;
import fragments.listview.ListViewStickyHeadersFragment;
import fragments.listview.ListViewSwipeToExecuteFragment;
import fragments.listview.ListViewSwipeToRefreshFragment;
import fragments.listview.ListViewWrapFragment;

public class AutoCompleteExamples implements ExamplesProvider {
    @Override
    public String controlName() {
        return "AutoCompleteTextView";
    }

    @Override
    public LinkedHashMap<String, ArrayList<ExampleFragment>> examples() {
        LinkedHashMap<String, ArrayList<ExampleFragment>> examples = new LinkedHashMap<>();

        ArrayList<ExampleFragment> examplesSet = new ArrayList<>();
        examplesSet.add(new AutoCompleteGettingStartedFragment());
        examplesSet.add(new AutoCompleteTokensFragment());
        examples.put("Feature Review", examplesSet);

        return examples;
    }
}
