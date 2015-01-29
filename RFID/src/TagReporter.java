import com.impinj.octanesdk.ImpinjReader;
import com.impinj.octanesdk.Tag;
import com.impinj.octanesdk.TagReport;
import com.impinj.octanesdk.TagReportListener;


public class TagReporter implements TagReportListener {

	@Override
	public void onTagReported(ImpinjReader reader, TagReport report) {
		TagWrapper wrappedTag;
		for (Tag t : report.getTags()) {
			wrappedTag = new TagWrapper(t);
			
			if (!DuplicateReadDetector.isDuplicateRead(wrappedTag)) {
				DuplicateReadDetector.addWrappedTag(wrappedTag);
				System.out.println(DuplicateReadDetector.getTagBatchTimeInfo());
			}
			else {//TESTING PURPOSES ONLY
				//System.out.println("\n\n **************DUPLICATE FOUND***************\n");
			}
		}

	}
}
