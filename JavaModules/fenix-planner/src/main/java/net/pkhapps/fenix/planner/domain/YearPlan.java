package net.pkhapps.fenix.planner.domain;

import net.pkhapps.fenix.domain.AggregateRoot;

import java.time.Year;
import java.util.List;

/**
 * Created by petterprivate on 17/12/2016.
 */
public class YearPlan extends AggregateRoot {

    private String name;
    private Year year;
    private List<YearPlanEntry> entries;
}
