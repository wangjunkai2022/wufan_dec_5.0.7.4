.class Lcom/join/mgps/activity/MGPapaAboutActivity$c;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "MGPapaAboutActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MGPapaAboutActivity;->h0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/MGPapaAboutActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGPapaAboutActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGPapaAboutActivity$c;->a:Lcom/join/mgps/activity/MGPapaAboutActivity;

    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 2

    .line 1
    new-instance p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {p1}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    const-string v0, "#F3F3F3"

    .line 2
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/MGPapaAboutActivity$c;->a:Lcom/join/mgps/activity/MGPapaAboutActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0711f3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->d:I

    return-object p1
.end method
