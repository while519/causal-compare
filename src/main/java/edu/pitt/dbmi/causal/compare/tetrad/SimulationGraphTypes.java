/*
 * Copyright (C) 2020 University of Pittsburgh.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package edu.pitt.dbmi.causal.compare.tetrad;

import edu.cmu.tetrad.algcomparison.graph.RandomGraph;

/**
 *
 * Aug 24, 2019 4:07:08 PM
 *
 * @author Kevin V. Bui (kvb2@pitt.edu)
 */
public final class SimulationGraphTypes extends AbstractClassFactory<RandomGraph> {

    private static final SimulationGraphTypes INSTANCE = new SimulationGraphTypes();

    private SimulationGraphTypes() {
        super("edu.cmu.tetrad.algcomparison.graph", RandomGraph.class);
    }

    public static SimulationGraphTypes getInstance() {
        return INSTANCE;
    }

}
