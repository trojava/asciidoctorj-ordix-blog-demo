package de.ordix.blog.asciidoc.kunden;

import java.util.HashMap;
import java.util.Map;

public class KundenRepository {

	private long kdNrSeq = 0;
	private Map<Long, Kunde> kundenDb = new HashMap<>();

	// tag::findMethod[]
	public Kunde find(long kdNr) { // <1>
		return kundenDb.get(kdNr);
	}
	// end::findMethod[]

	public Kunde save(Kunde kunde) { // <2>
		Long kdNr = kunde.getKdNr();
		if (null == kdNr) {
			kdNr = ++kdNrSeq;
			kunde.setKdNr(kdNr);
		}
		return kundenDb.put(kdNr, kunde);

	}
}
