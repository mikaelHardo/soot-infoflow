package soot.jimple.infoflow.util;

import soot.tagkit.AttributeValueException;
import soot.tagkit.Tag;

public class IntentTag implements Tag {
	
	private final String tagName;
	private final String value;

	public IntentTag(String tagName, String value) {
		this.tagName = tagName;
		this.value = value;
	}
	
	@Override
	public String getName() {
		return this.tagName;
	}

	public String getIntentID() {
		return this.value;
	}
	
	@Override
	public byte[] getValue() throws AttributeValueException {
		return this.value.getBytes();
	}

}
