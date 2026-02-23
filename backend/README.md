# 📍 프로젝트 명 (예: 推し足プロジェクト / oshiashi_project)
> **콘텐츠 속 그 장소로 떠나는 여행, 지도 기반 성지순례 & 테마 루트 가이드**

애니메이션, 드라마, 영화, MV 등 다양한 콘텐츠 속 촬영지를 쉽고 정확하게 찾고, 나만의 여행 코스를 설계하는 서비스입니다.

---

## ✨ 주요 기능 (Key Features)
- **콘텐츠 탐색**: 드라마, 영화, 애니메이션 등 카테고리별 성지 탐색
- **지도 기반 서비스**: Google Map 연동을 통한 실시간 위치 확인 및 루트 탐색
- **나만의 플래너**: 가고 싶은 장소를 담아 만드는 커스텀 여행 코스
- **커뮤니티**: 직접 찍은 성지 사진 공유 및 사용자 간 소통
- **게이미피케이션**: 방문 기록에 따른 유니크한 칭호 부여 (예정)

---

## 🛠 Tech Stack
- **Backend**: Java 21, Spring Boot, Spring Data JPA
- **Database**: MySQL
- **Frontend**: HTML/CSS,, JavaScript, Thymeleaf
- **API**: Google Maps Platform, Spotify API (예정)

---

## 🤝 협업 규칙 (Team Rules)

### 1. 브랜치 전략
- `main`: 최종 배포용 (직접 Push 금지 ❌)
- `develop`: 기능 통합 및 테스트용
- `feat/기능명`: 각자 기능 개발 (예: `feat/login`, `feat/map-api`)

### 2. 커밋 메시지 규칙
- `[Feat]` : 새로운 기능 추가
- `[Fix]` : 버그 수정
- `[Docs]` : 문서 수정 (README 등)
- `[Chore]` : 설정 파일 수정, 라이브러리 추가

### 3. 작업 프로세스
1. `develop` 브랜치에서 최신 코드 **Pull** 받기
2. 본인 기능 브랜치 생성 후 작업
3. 작업 완료 후 **Pull Request(PR)** 생성 -> 팀원 확인 -> 최종적으로 2명이상 확인 후 머지

---

## 💻 환경 설정 (Setup)

### IntelliJ / VS Code 공통
- **JDK 17** 설치 필수
- **Lombok** 플러그인 설치 필수
- `src/main/resources/application.yml` 설정 (DB 정보 등은 Notion 공지사항 참고)

### .gitignore 설정 완료
- `.idea/`, `.vscode/`, `build/`, `out/` 등 설정 및 빌드 파일은 제외됩니다.

---

## 👥 팀원 소개


---

© 2026 Team [쿠노이치안주조작단]. All rights reserved.
