# JAVA RMI 예제
## 실행 방법
1. 서버 프로젝트를 빌드한 후 build되어있는 프로젝트 루트 폴더로 이동
2. 콘솔로 `rmiregistry` 실행
3. server main 실행 `java example.server.MyRemoteImpl`
4. 클라이언트 프로젝트에 실행 후 결과 확인 `java example.client.MyRemoteClient`