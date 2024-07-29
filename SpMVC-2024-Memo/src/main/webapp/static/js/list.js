document.addEventListener("DOMContentLoaded", () => {
  const memo_list = document.querySelector("div.memo.list");

  const onDataClickHandler = (e) => {
    const target = e.target;
    if (target.tagName === "DIV") {
      const m_seq = dataset.m_seq;
      document.location.href = `${rootPath}/detail?m_seq=${m_seq}`;
    }
  };
});
