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
package com.jwebmp.plugins.d3.reingoldtilfordtree;

import com.jwebmp.core.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.core.htmlbuilder.css.fonts.FontFamilies;
import com.jwebmp.core.htmlbuilder.css.fonts.FontWeights;
import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSSImpl;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * @author Marc Magon
 * @version 1.0
 * @since 06 Sep 2015
 */
public class JWReingoldTilfordTreeTextOptions
		extends JavaScriptPart
{


	private MeasurementCSSImpl fontSize;
	private FontFamilies fontName;
	private FontWeights fontWeight;
	private String fontColour;
	private Double fillOpacity;
	private Integer marginLeft;
	private Integer marginRight;
	private Integer marginTop;
	private Integer marginBottom;
	private String backgroundColour;

	public JWReingoldTilfordTreeTextOptions()
	{
		//No config needed
	}

	public MeasurementCSSImpl getFontSize()
	{
		return fontSize;
	}

	public void setFontSize(MeasurementCSSImpl fontSize)
	{
		this.fontSize = fontSize;
	}

	public FontFamilies getFontName()
	{
		return fontName;
	}

	public void setFontName(FontFamilies fontName)
	{
		this.fontName = fontName;
	}

	public FontWeights getFontWeight()
	{
		return fontWeight;
	}

	public void setFontWeight(FontWeights fontWeight)
	{
		this.fontWeight = fontWeight;
	}

	public String getFontColour()
	{
		return fontColour;
	}

	public void setFontColour(ColourHex fontColour)
	{
		this.fontColour = fontColour.getValue();
	}

	public Double getFillOpacity()
	{
		return fillOpacity;
	}

	public void setFillOpacity(Double fillOpacity)
	{
		this.fillOpacity = fillOpacity;
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

	public String getBackgroundColour()
	{
		return backgroundColour;
	}

	public void setBackgroundColour(ColourHex backgroundColour)
	{
		this.backgroundColour = backgroundColour.getValue();
	}

}
