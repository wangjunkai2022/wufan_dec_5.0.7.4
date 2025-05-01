.class Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity$2;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "GamedownloadRecomdActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity;->afterview()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity$2;->this$0:Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity;

    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 2

    .line 1
    new-instance p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {p1}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity$2;->this$0:Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity;

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0713af

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->a:I

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity$2;->this$0:Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity;

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->b:I

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity$2;->this$0:Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity;

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07114a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->d:I

    return-object p1
.end method
