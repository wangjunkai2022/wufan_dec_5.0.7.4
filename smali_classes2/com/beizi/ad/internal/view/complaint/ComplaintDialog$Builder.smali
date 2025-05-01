.class public Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;
.super Ljava/lang/Object;
.source "ComplaintDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private complaintCloseView:Landroid/widget/ImageView;

.field private complaintEditText:Landroid/widget/EditText;

.field private complaintListRecycleView:Landroidx/recyclerview/widget/RecyclerView;

.field private complaintNormalLayout:Landroid/widget/RelativeLayout;

.field private complaintNumberView:Landroid/widget/TextView;

.field private complaintSubmitButton:Landroid/widget/Button;

.field private complaintSuggestLayout:Landroid/widget/RelativeLayout;

.field private complaintTextView:Landroid/widget/TextView;

.field private dialogItemCallback:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;

.field private isShowSuggestView:Z

.field private mDialog:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

.field private mLayout:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    sget v1, Lcom/beizi/ad/R$style;->beizi_ad_custom_dialog:I

    invoke-direct {v0, p1, v1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mDialog:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    const-string v0, "layout_inflater"

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 4
    sget v1, Lcom/beizi/ad/R$layout;->beizi_complaint_dialog:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mLayout:Landroid/view/View;

    .line 5
    iget-object v1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mDialog:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mLayout:Landroid/view/View;

    sget v1, Lcom/beizi/ad/R$id;->dislike_reasons_list_recycleview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintListRecycleView:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mLayout:Landroid/view/View;

    sget v1, Lcom/beizi/ad/R$id;->complaint_dialog_close_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintCloseView:Landroid/widget/ImageView;

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mLayout:Landroid/view/View;

    sget v1, Lcom/beizi/ad/R$id;->complaint_other_suggest_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintTextView:Landroid/widget/TextView;

    .line 9
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mLayout:Landroid/view/View;

    sget v1, Lcom/beizi/ad/R$id;->complaint_normal_ui:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintNormalLayout:Landroid/widget/RelativeLayout;

    .line 10
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mLayout:Landroid/view/View;

    sget v1, Lcom/beizi/ad/R$id;->complaint_other_suggest_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintSuggestLayout:Landroid/widget/RelativeLayout;

    .line 11
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mLayout:Landroid/view/View;

    sget v1, Lcom/beizi/ad/R$id;->complaint_input_other_edittext:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintEditText:Landroid/widget/EditText;

    .line 12
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mLayout:Landroid/view/View;

    sget v1, Lcom/beizi/ad/R$id;->complaint_other_suggest_number_textview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintNumberView:Landroid/widget/TextView;

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mLayout:Landroid/view/View;

    sget v1, Lcom/beizi/ad/R$id;->complaint_other_suggest_submit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintSubmitButton:Landroid/widget/Button;

    .line 14
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 15
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 16
    iget-object v1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintListRecycleView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 17
    invoke-static {}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->access$100()Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;

    move-result-object v0

    new-instance v1, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$1;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$1;-><init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)V

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->setOnItemClickListener(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$OnItemClickListener;)V

    .line 18
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintListRecycleView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->access$100()Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 19
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintTextView:Landroid/widget/TextView;

    new-instance v1, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$2;

    invoke-direct {v1, p0, p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$2;-><init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintCloseView:Landroid/widget/ImageView;

    new-instance v1, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;

    invoke-direct {v1, p0, p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$3;-><init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintEditText:Landroid/widget/EditText;

    new-instance v1, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$4;

    invoke-direct {v1, p0, p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$4;-><init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 22
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintSubmitButton:Landroid/widget/Button;

    new-instance v0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$5;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$5;-><init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->itemClickEvent(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->isShowSuggestView:Z

    return p0
.end method

.method static synthetic access$202(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->isShowSuggestView:Z

    return p1
.end method

.method static synthetic access$300(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Landroid/widget/EditText;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintEditText:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$400(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Landroid/content/Context;Landroid/widget/EditText;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->showSuggestInputLayout(Landroid/content/Context;Landroid/widget/EditText;)V

    return-void
.end method

.method static synthetic access$500(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mDialog:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    return-object p0
.end method

.method static synthetic access$600(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->dialogItemCallback:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;

    return-object p0
.end method

.method static synthetic access$700(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Landroid/widget/Button;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintSubmitButton:Landroid/widget/Button;

    return-object p0
.end method

.method static synthetic access$800(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintNumberView:Landroid/widget/TextView;

    return-object p0
.end method

.method private hideOrShowInputKeyboard(Landroid/content/Context;ZLandroid/widget/EditText;)V
    .locals 3

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p3}, Landroid/widget/EditText;->requestFocus()Z

    .line 2
    new-instance p2, Ljava/util/Timer;

    invoke-direct {p2}, Ljava/util/Timer;-><init>()V

    .line 3
    new-instance v0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$6;

    invoke-direct {v0, p0, p1, p3}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder$6;-><init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;Landroid/content/Context;Landroid/widget/EditText;)V

    const-wide/16 v1, 0x64

    invoke-virtual {p2, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p3}, Landroid/widget/EditText;->clearFocus()V

    const-string p2, "input_method"

    .line 5
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 6
    invoke-virtual {p3}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :goto_0
    return-void
.end method

.method private itemClickEvent(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->dialogItemCallback:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;->onDialogItemClick(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mDialog:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " \u88ab\u70b9\u51fb\u4e86"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BeiZisAd"

    invoke-static {v0, p1}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private showSuggestInputLayout(Landroid/content/Context;Landroid/widget/EditText;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->isShowSuggestView:Z

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintNormalLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintSuggestLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, p1, v0, p2}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->hideOrShowInputKeyboard(Landroid/content/Context;ZLandroid/widget/EditText;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintNormalLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->complaintSuggestLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 7
    invoke-direct {p0, p1, v2, p2}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->hideOrShowInputKeyboard(Landroid/content/Context;ZLandroid/widget/EditText;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public create()Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mDialog:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mLayout:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mDialog:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mDialog:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->mDialog:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    return-object v0
.end method

.method public setDialogItemCallback(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;)Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$Builder;->dialogItemCallback:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DialogItemCallback;

    return-object p0
.end method
