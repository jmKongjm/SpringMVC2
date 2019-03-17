/*이 클래스는 로직을 작성하기 위함이 아니라
 * 이 클래스로부터 생성되는 인스턴스 한 개가, 1개의 레코드를 담기 위함이다.
 * 또는 클라이언트가 브라우저로 전송한 파라미터들을 담기 위한 용도로 사용할 예정이다. 
 * 로직용 클래스가 아니라 단지 데이터만을 담기 위한 용도의 객체를 가리켜
 * 설계분야에서는 'VO(Value Object)', DTO(Data Transfer Object)
 */

package notice.model;

public class Notice {
	//데이터는 소중하기 때문에 보안되어야 한다. 따라서 private로 접근제한을 가한다.
	//외부의 객체가 이 인스턴스에 데이터를 담거나 가져가게 하려면
	//사용을 제한적으로  허용해줘야 하고 이런 객체 정의 기법을 가리켜
	//은닉화라고 한다. 
	private int notice_id;
	private String writer;
	private String title;
	private String content;
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	private String regdate;
	private int hit;

}
