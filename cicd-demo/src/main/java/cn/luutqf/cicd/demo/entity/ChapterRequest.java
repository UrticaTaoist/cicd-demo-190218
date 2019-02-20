package cn.luutqf.cicd.demo.entity;

import java.util.List;

/**
 * @Author: ZhenYang
 * @date: 2019/1/25
 * @description:
 */
public class ChapterRequest {
    private String username;
    private String chapterName;
    private Integer ttl;
    private String subjectName;
    private String image;
    private String targetPort;
    private String password;
    private String file;

    private List<String> ports;

    public ChapterRequest() {
    }

    public List<String> getPorts() {
        return ports;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ChapterRequest(String username, String chapterName, Integer ttl, String subjectName, String image, String targetPort, String password, String file, List<String> ports) {
        this.username = username;
        this.chapterName = chapterName;
        this.ttl = ttl;
        this.subjectName = subjectName;
        this.image = image;
        this.targetPort = targetPort;
        this.password = password;
        this.file = file;
        this.ports = ports;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }



    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(String targetPort) {
        this.targetPort = targetPort;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}