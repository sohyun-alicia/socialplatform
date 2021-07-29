# socialplatform
learning how to use postvariable annotation &amp; JPA bulding a social platfor

# 맥 사용법
## 1. 프로그램 종료
* 프로그램 종료 Cmd + q
* 한탭만 종료 Cmd + w

## 2. 복사 붙여넣기   
* 한영 Caps lock   
* 복사 cmd + c   
* 붙여넣기 cmd + V   
* 경로복사 cmd + option + c   
* 잘라내기 cmd + C >>> cmd + option + V   

* 프로그램 종료 Cmd + q   
* 한탭만 종료   cmd + w

## 3. 스크린샷   
* Shift + Command + 3 : 화면 그림을 파일로 저장   
* Control + Shift + Command + 3 : 화면 그림을 클립보드에 복사   
* Shift + Command + 4 : 선택한 영역 그림을 파일로 저장   
* Control + Shift + Command + 4 : 선택한 영역 그림을 클립보드에 복사

## 4. 맥 터미널(bash) 사용
(Finder > 이동 > Utilities > 터미널)   
* ls : 디렉토리 파일, 폴더 보여주기      
* ls -la :         
* cd : change directory      
* clear :  clear screen.  화면 글씨 비워줌      
* cp : 지정된 디렉토리로 파일 복사      
* rm : 파일 삭제   


# 회사관련
 
## 1. 회사 개요 
해피투씨유(4~9 어린이 교육), 미식의시대(배달플랫폼)

## 2. 회사 관련 설정

1. 알밤(출퇴근 기록), 네이버웍스(사내 메신저) 설치하기

2. 네이버웍스 https://naver.worksmobile.com/
웹사이트에서 비밀번호 변경하기
ex)
Id : sohyunwi@mealgen.net
Pw : ...
네이버웍스 환경설정에서 다운로드경로 수정

3. 네이버웍스 이메일주소를 구글계정으로 생성 요청 => 유정아 이사님

4. 구글에서 로그인 

5. 방남진 대표님에게 공유드라이브 요청 sohyunwi@mealgen.net

6. 설정관련 북마크 복사, 불러오기

# 개발세팅
## 1. Homebrew
Homebrew란 ... 
Apple/Linus 시스템에서 제공하지 않는 유용한 패키지 관리자 설치

cmd 창에서 /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)" 입력후 enter

## 2. Git setting
bash git 사용

1. bash 창 열기(바탕화면 클릭 > 이동 > 유틸리티 > 터미널 선택. 자주 사용하므로 Docker에 고정해놓기 )

2. git --version 깃 설치 여부 확인

3. brew install git 깃 설치

## 3. Git 사용
cd /   
ls -la   
cd users   
cd happytoseeyou   
cd desktop   
cd dev   
cd     

cd /users/happytoseeyou/desktop/dev/workspace   
cd /users/happytoseeyou/desktop/dev/downloads/apache-tomcat-9.0.50


git clone https://github.com/happytoseeyouteam/happytoseeyou-api.git


## 4. Dbeaver 
database tool로 Dbeaver 사용

cmd 창에 
brew install --cask dbeaver-community 
or dmg 파일 다운로드    
https://dbeaver.io/


## 5. Visual Studio Code 
https://code.visualstudio.com/download


## 6. Intellij 
Community version으로 설치   
https://www.jetbrains.com/ko-kr/idea/download/#section=mac

## 7. Tomcat
   bash창에
1. brew update 
2. brew list
3. brew install tomcat@9
4. 설치후 brew list로 설치 확인

/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

* 직접 파일 다운후 설치 방법
sudo 
1. sudo mv /users/happytoseeyou/desktop/dev/downloads/apache-tomcat-9.0.50 /usr/local
2. sudo chown -R happytoseeyou /Library/Tomcat 
3. sudo chmod +x /Library/Tomcat/bin/*.sh

## 8. SSH 연결
* 터미널 > 셀 >    
cd /home/happytoseeyou    
cat init-server.sh   
ssh root@45.119.144.87 -p 2212 

* 리눅스 개발서버 서버 sh   
export USER=happytoseeyou   
cd /home/$USER/repo   
sudo -u $USER -H git pull origin deploy/stage   
#sudo -u $USER -H git pull origin master   
sudo -u $USER -H ./gradlew clean explodeWar   
sudo -u $USER -H /home/$USER/tomcat1/bin/catalina.sh stop   
sudo -u $USER -H rm -rf /home/$USER/wwwhost1   
sudo -u $USER -H mv ./build/exploded /home/$USER/wwwhost1   
sudo -u $USER -H /home/$USER/tomcat1/bin/catalina.sh start
until [ "$(curl -w '%{response_code}' --no-keepalive -o /dev/null --connect-timeout 1 -G -L http://localhost:8080)" == "200" ];
do echo --- sleeping for 1 second;
sleep 1;
done

* 개발쪽 sh   
export USER=happytoseeyou   
   cd /home/$USER/repo   
   sudo -u $USER -H git pull origin deploy/prod   
   sudo -u $USER -H ./gradlew clean explodeWar   
   sudo -u $USER -H /home/$USER/tomcat1/bin/catalina.sh stop   
   sudo -u $USER -H rm -rf /home/$USER/wwwhost1   
   sudo -u $USER -H mv ./build/exploded /home/$USER/wwwhost1   
   sudo -u $USER -H /home/$USER/tomcat1/bin/catalina.sh start
   
   until [ "$(curl -w '%{response_code}' --no-keepalive -o /dev   
   null --connect-timeout 1 -G -L http://localhost:8080)" ==   
   "200" ];   
   do echo --- sleeping for 1 second;   
   sleep 1;   
   done


## war 배포용 만들기
경로로 이동
./gradlew clean explodeWar

## 9. RESTful API    
* Building a RESTful Web Service   
https://spring.io/guides/gs/rest-service/   
* Consuming a RESTful Web Service   
https://spring.io/guides/gs/consuming-rest/   
* Social Service Tutorial   
https://www.kindsonthegenius.com/spring-boot16-spring-boot-crud-operation-with-jpa-repository/
* Spring boot
https://start.spring.io/

## 10. SQL
SELECT ... FROM   
WHERE ... LIKE

ERD(Entity Relationship Diagram) 

* 항상 먼저 WHERE문으로 선택된 데이터 확인하고 update하기
* 데이터 임의로 입력한 경우 
alter table lesson auto_increment=66; 


## 11. Swagger
Tutorial :
https://memostack.tistory.com/17

* 2.9.2버전으로 dependency설정    
implementation 'io.springfox:springfox-swagger-ui:2.9.2'   
implementation 'io.springfox:springfox-swagger2:2.9.2'

## 12. React Native Chocolatey


# 기타 참고하면 좋은 페이지
## 마크다운
https://gist.github.com/ihoneymon/652be052a0727ad59601#this-is-a-h5


## poor sql
https://poorsql.com/ sql query문 열정리
