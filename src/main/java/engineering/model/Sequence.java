package engineering.model;
// Generated Nov 1, 2023, 10:50:55 AM by Hibernate Tools 4.3.6.Final

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Sequence generated by hbm2java
 */
@Entity
@Table(name = "SEQUENCE")
public class Sequence implements java.io.Serializable {

	private String seqName;
	private BigInteger seqCount;

	public Sequence() {
	}

	public Sequence(String seqName) {
		this.seqName = seqName;
	}

	public Sequence(String seqName, BigInteger seqCount) {
		this.seqName = seqName;
		this.seqCount = seqCount;
	}

	@Id

	@Column(name = "SEQ_NAME", unique = true, nullable = false, length = 50)
	public String getSeqName() {
		return this.seqName;
	}

	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}

	@Column(name = "SEQ_COUNT", precision = 38, scale = 0)
	public BigInteger getSeqCount() {
		return this.seqCount;
	}

	public void setSeqCount(BigInteger seqCount) {
		this.seqCount = seqCount;
	}

}
