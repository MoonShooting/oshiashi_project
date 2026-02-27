import React from 'react';
import './NavBar.css';

function Nav() {
  return (
    <nav className="navbar">
      <header>
        <span>≡</span>
        <h1>推し足 (Oshiashi)</h1>
      </header>

      <div className="search">
        <span>🔍</span>
        <input type="text" placeholder="작품명, 장소, 태그 검색..." />
        <a href="#">
          <icon />
          <span>검색</span>
        </a>
      </div>

      <aside>
        <button>+ 루트 공유</button>
        <div className="profile" />
      </aside>
    </nav>
  );
}

export default Nav;
