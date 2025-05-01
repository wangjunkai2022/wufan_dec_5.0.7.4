.class Lcom/join/mgps/activity/QuarkPromptActivity$b;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "QuarkPromptActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/QuarkPromptActivity;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/QuarkPromptActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/QuarkPromptActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$b;->a:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 2

    .line 1
    new-instance p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {p1}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$b;->a:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f071341

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->d:I

    const/4 v0, 0x0

    .line 3
    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    return-object p1
.end method
