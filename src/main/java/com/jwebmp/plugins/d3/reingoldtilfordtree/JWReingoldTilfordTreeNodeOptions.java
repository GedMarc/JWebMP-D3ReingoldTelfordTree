/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.d3.reingoldtilfordtree;

import com.jwebmp.core.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSSImpl;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * @author GedMarc
 * @version 1.0
 * @since 06 Sep 2015
 */
public class JWReingoldTilfordTreeNodeOptions
		extends JavaScriptPart
{


	private String markerType;
	private Double markerSize;
	private String fill;
	private String stroke;
	private String strokeWidth;
	private Integer marginLeft;
	private Integer marginRight;
	private Integer marginTop;
	private Integer marginBottom;
	private Double fillOpacity;
	private Double strokeOpacity;

	public JWReingoldTilfordTreeNodeOptions()
	{
		//Nothing needed
	}

	public String getMarkerType()
	{
		return markerType;
	}

	public void setMarkerType(String markerType)
	{
		this.markerType = markerType;
	}

	public Double getMarkerSize()
	{
		return markerSize;
	}

	public void setMarkerSize(Double markerSize)
	{
		this.markerSize = markerSize;
	}

	public String getFill()
	{
		return fill;
	}

	public void setFill(ColourHex fill)
	{
		this.fill = fill.getValue();
	}

	public String getStroke()
	{
		return stroke;
	}

	public void setStroke(ColourHex stroke)
	{
		this.stroke = stroke.getValue();
	}

	public String getStrokeWidth()
	{
		return strokeWidth;
	}

	public void setStrokeWidth(MeasurementCSSImpl strokeWidth)
	{
		this.strokeWidth = strokeWidth.toString(true)
		                              .replace("'", "");
	}

	public Integer getMarginLeft()
	{
		return marginLeft;
	}

	public void setMarginLeft(Integer marginLeft)
	{
		this.marginLeft = marginLeft;
	}

	public Integer getMarginRight()
	{
		return marginRight;
	}

	public void setMarginRight(Integer marginRight)
	{
		this.marginRight = marginRight;
	}

	public Integer getMarginTop()
	{
		return marginTop;
	}

	public void setMarginTop(Integer marginTop)
	{
		this.marginTop = marginTop;
	}

	public Integer getMarginBottom()
	{
		return marginBottom;
	}

	public void setMarginBottom(Integer marginBottom)
	{
		this.marginBottom = marginBottom;
	}

	public Double getFillOpacity()
	{
		return fillOpacity;
	}

	public void setFillOpacity(Double fillOpacity)
	{
		this.fillOpacity = fillOpacity;
	}

	public Double getStrokeOpacity()
	{
		return strokeOpacity;
	}

	public void setStrokeOpacity(Double strokeOpacity)
	{
		this.strokeOpacity = strokeOpacity;
	}

}
