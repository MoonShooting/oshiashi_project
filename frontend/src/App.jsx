import React from "react";
import Home from "./pages/Home";

function App() {
  return (
    <div className="App">
      {/* 나중에 네비게이션(상단바)이나 푸터(하단바)를 여기에 넣으면 
        모든 페이지에서 공통으로 보이게 됩니다.
      */}
      <Home />
    </div>
  );
}

export default App;
