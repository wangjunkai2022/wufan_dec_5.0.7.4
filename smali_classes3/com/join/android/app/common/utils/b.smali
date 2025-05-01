.class public final synthetic Lcom/join/android/app/common/utils/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/customview/o;

.field public final synthetic c:Landroid/widget/CheckBox;

.field public final synthetic d:Lcom/join/mgps/db/tables/EMUApkTable;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/customview/o;Landroid/widget/CheckBox;Lcom/join/mgps/db/tables/EMUApkTable;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/android/app/common/utils/b;->b:Lcom/join/mgps/customview/o;

    iput-object p2, p0, Lcom/join/android/app/common/utils/b;->c:Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/join/android/app/common/utils/b;->d:Lcom/join/mgps/db/tables/EMUApkTable;

    iput-object p4, p0, Lcom/join/android/app/common/utils/b;->e:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/join/android/app/common/utils/b;->b:Lcom/join/mgps/customview/o;

    iget-object v1, p0, Lcom/join/android/app/common/utils/b;->c:Landroid/widget/CheckBox;

    iget-object v2, p0, Lcom/join/android/app/common/utils/b;->d:Lcom/join/mgps/db/tables/EMUApkTable;

    iget-object v3, p0, Lcom/join/android/app/common/utils/b;->e:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/join/android/app/common/utils/APKUtils$Companion;->a(Lcom/join/mgps/customview/o;Landroid/widget/CheckBox;Lcom/join/mgps/db/tables/EMUApkTable;Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void
.end method
