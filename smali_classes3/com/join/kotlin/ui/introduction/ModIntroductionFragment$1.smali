.class Lcom/join/kotlin/ui/introduction/ModIntroductionFragment$1;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "ModIntroductionFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/introduction/ModIntroductionFragment;->aftervidew()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/introduction/ModIntroductionFragment;

.field final synthetic val$decoration:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/introduction/ModIntroductionFragment;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/introduction/ModIntroductionFragment$1;->this$0:Lcom/join/kotlin/ui/introduction/ModIntroductionFragment;

    iput-object p2, p0, Lcom/join/kotlin/ui/introduction/ModIntroductionFragment$1;->val$decoration:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/kotlin/ui/introduction/ModIntroductionFragment$1;->val$decoration:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    return-object p1
.end method
