.class Lcom/join/kotlin/ui/introduction/MoreIntroductionFragment$1;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "MoreIntroductionFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/introduction/MoreIntroductionFragment;->aftervidew()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/introduction/MoreIntroductionFragment;

.field final synthetic val$decoration1:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/introduction/MoreIntroductionFragment;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/introduction/MoreIntroductionFragment$1;->this$0:Lcom/join/kotlin/ui/introduction/MoreIntroductionFragment;

    iput-object p2, p0, Lcom/join/kotlin/ui/introduction/MoreIntroductionFragment$1;->val$decoration1:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/kotlin/ui/introduction/MoreIntroductionFragment$1;->val$decoration1:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    return-object p1
.end method
