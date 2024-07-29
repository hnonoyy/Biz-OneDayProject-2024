document.addEventListener("DOMContentLoaded", () => {
  const input_form = document.querySelector("section.memo.list from");

  const input_m_title = input_form.querySelector("#m_title");
  const input_m_memo = input_form.querySelector("#m_memo");
  const btn_save = input_form.querySelector("button.save");

  const onSaveHandler = async () => {
    if (!title) {
      alert("제목을 입력해주세요");
      return false;
    }
  };
});
