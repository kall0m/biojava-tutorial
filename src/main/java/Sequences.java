import org.biojava.nbio.core.exceptions.CompoundNotFoundException;
import org.biojava.nbio.core.sequence.DNASequence;
import org.biojava.nbio.core.sequence.ProteinSequence;
import org.biojava.nbio.core.sequence.RNASequence;
import org.biojava.nbio.core.sequence.compound.AmbiguityDNACompoundSet;

public class Sequences {
    public static void main(String[] args) throws CompoundNotFoundException {
        DNASequence dna = new DNASequence("GTAC");
        RNASequence rna = new RNASequence("GUAC");
        ProteinSequence prot = new ProteinSequence("MSTNPKPQRKTKRNTNRRPQDVKFPGG");

        //DNASequence dna2 = new DNASequence("WWW");

        AmbiguityDNACompoundSet ambiguityDNACompoundSet = AmbiguityDNACompoundSet.getDNACompoundSet();
        DNASequence dna2 = new DNASequence("WWW",ambiguityDNACompoundSet);
    }
}
