/*
 * Copyright (c) 2010
 *
 * This file is part of HibernateJConsole.
 *
 *     HibernateJConsole is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     HibernateJConsole is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with HibernateJConsole.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.hibernate.jconsole;

/**
 * Is implemented by classes that may be refreshed after the hibernate context was updated.
 *
 * @author Juergen_Kellerer, 2009-11-19
 * @version 1.0
 */
public interface Refreshable {
	/**
	 * Is called by the update thread after the hibernate context was successfully updated.
	 *
	 * @param context The updated context instance.
	 */
	void refresh(AbstractStatisticsContext context);
}
