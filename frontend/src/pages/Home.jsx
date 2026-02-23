import React from "react";

function Home() {
  // 💡 가이드: 나중에 백엔드 API에서 받아올 데이터의 예시입니다.
  const spots = [
    {
      id: 1,
      name: "아키하바라",
      anime: "슈타인즈 게이트",
      image: "https://via.placeholder.com/150",
    },
    {
      id: 2,
      name: "스가 신사 계단",
      anime: "너의 이름은",
      image: "https://via.placeholder.com/150",
    },
  ];

  return (
    <div style={{ padding: "20px" }}>
      <header style={{ textAlign: "center", marginBottom: "40px" }}>
        <h1>⛩️ OshiaShi</h1>
        <p>도쿄 애니메이션 성지순례의 모든 것</p>
      </header>

      <section>
        <h2>인기 성지 목록</h2>
        <div
          style={{
            display: "grid",
            gridTemplateColumns: "repeat(2, 1fr)",
            gap: "20px",
          }}
        >
          {/* 💡 가이드: 데이터 리스트를 반복문(map)으로 출력하는 방법입니다. */}
          {spots.map((spot) => (
            <div
              key={spot.id}
              style={{
                border: "1px solid #ddd",
                padding: "10px",
                borderRadius: "8px",
              }}
            >
              <img src={spot.image} alt={spot.name} style={{ width: "100%" }} />
              <h3>{spot.name}</h3>
              <p>작품: {spot.anime}</p>
              <button
                onClick={() => alert(`${spot.name} 상세 페이지로 이동합니다.`)}
              >
                자세히 보기
              </button>
            </div>
          ))}
        </div>
      </section>
    </div>
  );
}

export default Home;
