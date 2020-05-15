class  C{
    public void m(View v) {
        switch (v.getId()) {
        case R.id.btn_yes:
          c.finish();
        case R.id.btn_no:
          dismiss();
        default:
          break;
        }
        dismiss();
    }
}