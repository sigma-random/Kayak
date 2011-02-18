/**
 * 	This file is part of Kayak.
 *
 *	Kayak is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU Lesser General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	Kayak is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU Lesser General Public License
 *	along with Kayak.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.github.kayak.ui.projects;

import com.github.kayak.core.*;
import java.util.ArrayList;

/**
 *
 * @author Jan-Niklas Meier <dschanoeh@googlemail.com>
 */
public class Project {
    private ArrayList<Bus> busses;
    private String name;

    public ArrayList<Bus> getBusses() {
        return busses;
    }

    public void addBus(Bus b) {
        busses.add(b);
    }

    public String getName() {
        return name;
    }

    public Project(String name) {
        this.name = name;
        busses = new ArrayList<Bus>();
    }


}
