/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.components.d3.reingoldtilfordtree;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * An interactive version of the Reingold–Tilford Tree
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "Reingold-Tilford Tree", description = "A D3 generated dynamically placed tree based on values and space available", url = "https://sourceforge.net/p/jwebswing/jqd3/")
public class JWReingoldTilfordTree<J extends JWReingoldTilfordTree<J>> extends Div
{

    private static final long serialVersionUID = 1L;
    private JWReingoldTilfordTreeFeature feature;

    public JWReingoldTilfordTree()
    {
        feature = new JWReingoldTilfordTreeFeature(this);
        addFeature(feature);

    }
	@Override
    public JWReingoldTilfordTreeOptions getOptions()
    {
        return getFeature().getOptions();
    }

    public JWReingoldTilfordTreeFeature getFeature()
    {
        return feature;
    }

    public void setFeature(JWReingoldTilfordTreeFeature feature)
    {
        this.feature = feature;
    }

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JWReingoldTilfordTree<?> that = (JWReingoldTilfordTree<?>) o;

		if (!getFeature().equals(that.getFeature()))
		{
			return false;
		}
		return getOptions().equals(that.getOptions());
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
